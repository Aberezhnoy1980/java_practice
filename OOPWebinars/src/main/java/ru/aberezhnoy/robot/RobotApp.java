package ru.aberezhnoy.robot;

public class RobotApp {
    public static void main(String[] args) {
        final Robot1 robot1 = new Robot1("name_1", 1);

        System.out.printf("%s, %d\n", robot1.name, robot1.level);
        robot1.startBIOS();
        robot1.startOS();
        robot1.sayHi();

        robot1.work();
        robot1.work();
        robot1.work();

        robot1.sayBye();
        robot1.stopOS();
        robot1.stopBIOS();

        System.out.println("-----------------------------");

        final Robot2 robot2 = new Robot2("name_2", 1);
        System.out.println(robot2);

        robot2.powerOn();
        robot2.work();
        robot2.work();
        robot2.work();
        robot2.powerOff();

        System.out.println("-----------------------------");

        final Robot3 robot3 = new Robot3();
        System.out.println(robot3);
        robot3.power();
        robot3.work();
        robot3.power();
        robot3.work();
        robot3.power();
    }
}
