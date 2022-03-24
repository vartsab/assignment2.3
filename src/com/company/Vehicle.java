package com.company;

public abstract class Vehicle {

    private String modelName;
    private int wheelsCount;

    public Vehicle (String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() { return modelName; }
    public void setModelName(String modelName) { this.modelName = modelName; }
    public int getWheelsCount() { return wheelsCount; }
    public void setWheelsCount(int wheelsCount) { this.wheelsCount = wheelsCount; }

    public void updateTyre() {
        for (int i = 0; i < this.getWheelsCount(); i++)
            System.out.println("Меняем покрышку");
    }

}