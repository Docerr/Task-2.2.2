package web.model;

public class Car {

    private String model;
    private int price;
    private int age;

    public Car(String model, int price, int age) {
        this.model = model;
        this.price = price;
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car - " + model + ", price = " + price + ", age = " + age;
    }
}
