package ru.aberezhnoy.robot;

public class Robot1 {
    /**
     * Robot's level
     */
    public int level;

    /**
     * Robot's name
     */
    public String name;

    /**
     * Robot creation
     *
     * @param name  Robot's name. Must not start with a number
     * @param level Robot's level
     */
    public Robot1(String name, int level) {
        this.name = name;
        this.level = level;
    }

    /**
     * Load BIOS
     */
    public void startBIOS() {
        System.out.println("Start BIOS...");
    }

    /**
     * Load OS
     */
    public void startOS() {
        System.out.println("Start OS...");
    }

    /**
     * Greetings
     */
    public void sayHi() {
        System.out.println("Hello world...");
    }

    /**
     * Stop BIOS
     */
    public void stopBIOS() {
        System.out.println("Stop BIOS...");
    }

    /**
     * Stop OS
     */
    public void stopOS() {
        System.out.println("Stop OS");
    }

    /**
     * Goodbye
     */
    public void sayBye() {
        System.out.println("Bye...");
    }

    /**
     * Work
     */
    public void work() {
        System.out.println("Working...");
    }
}
