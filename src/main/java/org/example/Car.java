package org.example;

public class Car {
    abstract class Engine {
        public abstract void start();

        public abstract void stop();
    }

    class PatrolEngine extends Engine {

        public void start() {
            System.out.println("Бензиновый двигатель запущен");

        }

        public void stop() {
            System.out.println("Бензиновый двигатель заглушен");
        }
    }
    class ElectricEngine extends Engine {
        public void start() {
            System.out.println("Электрический двигатель запущен");

        }

        public void stop() {
            System.out.println("Электрический двигатель заглушен");
        }
    }
    interface EngineControl{
        void start();
        void stop();
    }
    public class Wheel{

    }
}
