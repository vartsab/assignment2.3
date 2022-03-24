package com.company;

public class Truck extends Car implements IService {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + this.getModelName());
        this.updateTyre();
        this.checkEngine();
        this.checkTrailer();
    }

}