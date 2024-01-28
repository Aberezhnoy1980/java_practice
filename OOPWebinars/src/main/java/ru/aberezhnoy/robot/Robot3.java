package ru.aberezhnoy.robot;

import java.util.ArrayList;

public class Robot3 {
    /**
     * List of available states
     */
    enum State {
        On, Off
    }

    /**
     * Index for name creation
     */
    private static int defaultIndex;

    /**
     * List of available names
     */
    private static ArrayList<String> names;

    static {
        defaultIndex = 1;
        names = new ArrayList<>();
    }

    /**
     * Robot's level
     */
    private int level;

    /**
     * Robot's name
     */
    private String name;

    /**
     * Robot's state
     */
    private State state;

    /**
     * Robot creation. Maximum list of parameters
     *
     * @param name  Robot's name
     * @param level Robot's level
     */
    private Robot3(String name, int level) {
//        System.out.println(Character.isDigit(name.charAt(0)));
        if ((name.isEmpty() || Character.isDigit(name.charAt(0))) || Robot3.names.indexOf(name) != -1) {
            this.name = String.format("DefaultName_%d", defaultIndex++);
        } else {
            this.name = name;
        }

        Robot3.names.add(this.name);
        this.level = level;
        this.state = State.Off;
    }

    /**
     * Constructor with one parameter
     *
     * @param name Robot's name
     */
    public Robot3(String name) {
        this(name, 1);
    }

    /**
     * Constructor with no arguments
     */
    public Robot3() {
        this("");
    }

    /**
     * @return Robot's name
     */
    public String getName() {
        return name;
    }

    /**
     * @return Robot's name
     */
    public int getLevel() {
        return level;
    }

    /**
     * Power controls
     */
    public void power() {
        if (state.equals(State.Off)) {
            this.powerOn();
            this.state = State.On;
        } else {
            this.powerOff();
            this.state = State.Off;
        }
    }

    /**
     * Turn on the Robot
     */
    private void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    /**
     * Turn off the robot
     */
    private void powerOff() {
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    /**
     * Start BIOS
     */
    private void startBIOS() {
        System.out.println("Start BIOS...");
    }

    /**
     * Start OS
     */
    private void startOS() {
        System.out.println("Start OS...");
    }


    /**
     * Greeting
     */
    private void sayHi() {
        System.out.println("Hello world...");
    }

    /**
     * Goodbye
     */
    private void sayBye() {
        System.out.println("Bye...");
    }

    /**
     * Stop OS
     */
    private void stopOS() {
        System.out.println("Stop OS...");
    }

    /**
     * Stop BIOS
     */
    private void stopBIOS() {
        System.out.println("Stop BIOS...");
    }

    /**
     * Work
     */
    public void work() {
        if (state.equals(State.On)) {
            System.out.println("Working...");
        }
    }

    /**
     * @return String to console print
     */
    @Override
    public String toString() {
        return String.format("Robot: %s, level: %d\n", this.name, this.level);
    }
}
