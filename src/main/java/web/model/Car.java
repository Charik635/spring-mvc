package web.model;

public class Car {
    private String model;
    private int id;

    public Car(String model, int id) {
        this.model = model;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", id=" + id +
                '}';
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }
}
