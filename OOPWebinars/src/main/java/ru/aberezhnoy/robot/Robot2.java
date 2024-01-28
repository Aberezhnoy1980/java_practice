package ru.aberezhnoy.robot;

public class Robot2 {
    /**
     * Robot's level
     */
    private int level;

    /**
     * Robot's name
     */
    private String name;

    /**
     * Robot creation
     *
     * @param name  Robot's name. Must not start with a number
     * @param level Robot's level
     */
    public Robot2(String name, int level) {
        this.name = name;
        this.level = level;
    }

    /**
     * @return Robot's name
     */
    public String getName() {
        return name;
    }

    /**
     * @return Robot's level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Turn on the Robot
     */
    public void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    /**
     * Turn off thw Robot
     */
    public void powerOff() {
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

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
     * Greetings
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
     * Stop OS
     */
    private void stopBIOS() {
        System.out.println("Stop BIOS...");
    }

    /**
     * The Robot is working
     */
    public void work() {
        System.out.println("Working...");
    }

    /**
     * @return information about Robot
     */
    private String getInfo() {
        return String.format("Robot: %s, level: %d\n", this.name, this.level);
    }

    /**
     * @return String to console print
     */
    @Override
    public String toString() {
        return getInfo();
    }
}
