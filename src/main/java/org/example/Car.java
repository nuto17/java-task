package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@NoArgsConstructor
public class Car {
    private boolean[] wheels;
    private Engine engine;

    public Car(boolean[] wheels, Engine engine) {
        this.wheels = wheels;
        this.engine = engine;
    }

    public void drive() {
        boolean wheelStatus = true;
        System.out.println("проверяем двигатель");
        engine.start();
        for (int i = 0; i < wheels.length; i++) {
            if (!wheels[i]) {
                System.out.println("колесо" + (i + 1) + "неисправно");
                wheelStatus = false;
            }
        }
        if (wheelStatus) {
            System.out.println("все колеса исправны");
        }   engine.stop();//проверка завершена
    }


   public abstract static class Engine implements EngineControl {
    }


    public static class PetrolEngine extends Engine implements EngineControl {
        @Override
        public void start() {
            System.out.println("Бензиновый двигатель запущен");
        }

        @Override
        public void stop() {
            System.out.println("Бензиновый двигатель заглушен");
        }
    }

    public static class ElectricEngine extends Engine implements EngineControl {
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


