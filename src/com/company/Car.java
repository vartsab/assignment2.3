package com.company;

public class Car extends Vehicle implements IService {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + this.getModelName());
        this.updateTyre();
        this.checkEngine();
    }

}