package web.models;

import org.springframework.stereotype.Component;

public class Car {
    private long id;
    private String model;
    private int engine;

    public Car() {
    }

    public Car(long id, String model, int engine) {
        this.id = id;
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public int getEngine() {
        return engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
