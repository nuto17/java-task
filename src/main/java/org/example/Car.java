package org.example;

import lombok.Data;

import java.util.Scanner;

@Data
public class Car {
    private String engineType;
    private boolean[] wheels;

    public Car(String engineType, boolean[] wheels) {
        this.engineType = engineType;
        this.wheels = wheels;
    }

    public void drive() {
        boolean wheelStatus = true;
        for (int i = 0; i < wheels.length; i++) {
            if (!wheels[i]) {
                System.out.println("колесо" + (i + 1) + "неисправно");
                wheelStatus = false;
            }
        }
        if (wheelStatus) {
            System.out.println("все колеса исправны");
        }
    }

    public boolean canCarRide() {
        for (boolean wheel : wheels) {
            if (!wheel) {
                return false;

            }
        }
        return true;
    }


    abstract class Engine implements EngineControl {
    }


    class PetrolEngine extends Engine implements EngineControl {
        @Override
        public void start() {
            System.out.println("Бензиновый двигатель запущен");
        }

        @Override
        public void stop() {
            System.out.println("Бензиновый двигатель заглушен");
        }
    }

    class ElectricEngine extends Engine implements EngineControl {
        @Override
        public void start() {
            System.out.println("электрический двигатель запушен");
        }

        @Override
        public void stop() {
            System.out.println("электрический двигатель заглушен");
        }
    }
}


