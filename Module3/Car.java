public class Car {
    String make;
    String model;
    int year;

    void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Car c1 = new Car();

        c1.make = "Toyota";
        c1.model = "Camry";
        c1.year = 2022;

        c1.displayDetails();

        Car c2 = new Car();

        c2.make = "Hyundai";
        c2.model = "i20";
        c2.year = 2021;

        c2.displayDetails();
    }
}