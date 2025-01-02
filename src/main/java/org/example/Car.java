package org.example;

import lombok.Data;

import java.util.Scanner;

interface EngineControl {
    void start();

    void stop();
}

interface WheelCheck {
    void checkStatus(int wheelIndex);
}

@Data
public class Car {
    private String engineType;
    private boolean[] wheels;

    public Car(String engineType) {
        this.engineType = engineType;
        this.wheels = new boolean[4];
    }

    public void drive() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите статус колес");
        
        for (int i = 0; i < wheels.length; i++) {
            wheel.checkStatus(i);
        }
        if (canCarRide()) {
            System.out.println("Машина готова к движению");
        } else {
            System.out.println("Машина не может поехать, проверьте колеса");
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
        public void start() {
        }

        ;

        public void stop() {
        }

        ;
    }

    class PetrolEngine implements EngineControl {
        @Override
        public void start() {
            System.out.println("Бензиновый двигатель запущен");
        }

        @Override
        public void stop() {
            System.out.println("Бензиновый двигатель заглушен");
        }
    }

    @Data
    class Wheel implements WheelCheck {
        private boolean status;

        public Wheel(Boolean status) {
            this.status = status;
        }

        @Override
        public void checkStatus(int wheelIndex) {
            if (status) {
                wheels[wheelIndex] = true;
            } else {
                wheels[wheelIndex] = false;
            }
        }
    }
}