package org.example;

import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void showEngineType() {
        System.out.println("выберете тип двигателя машины: ");
        System.out.println("1 - бензиновый");
        System.out.println("2 - электрический");
        System.out.println("3 - выйти");
    }

    private static boolean[] setWheels() {
        boolean[] wheels = new boolean[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = scanner.nextBoolean();
        }
        return wheels;
    }

    public static void showMenu() {
        boolean[] wheels = setWheels();
        Car car = new Car(wheels, null);
        boolean running = true;
        while (running) {
            showEngineType();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("вы выбрали бензиновый двигатель");
                    car.setEngine(new Car.PetrolEngine());
                    car.getEngine().start();
                    car.drive();
                    running = false;
                    break;

                case 2:
                    System.out.println("вы выбрали электрический двигатель");
                    car.setEngine(new Car.ElectricEngine());
                    car.getEngine().start();
                    car.drive();
                    running = false;
                    break;
                case 3:
                    running = false;
                    break;

            }

        }
    }
}

