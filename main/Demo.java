package main;

import vehicledef.Car;
import vehicledef.RaceCar;

public class Demo{
    public static void main(String[] args){
        

        Car car1 = new Car("Scorpio", 2014, "Mahindra");
        // car1.setBrand("BMW");
        // car1.setName("M5 CS");
        // car1.setYear(2024);

        Car car2 = new Car();
        car2.setBrand("Audi");
        car2.setName("RS7");
        car2.setYear(2019);

        car1.display();
        car2.display();

        RaceCar rc1 = new RaceCar();
        rc1.setBrand("Mercedes");
        rc1.setName("GLS");
        rc1.setYear(2020);
        rc1.setEngine(1.6f);
        rc1.setMaxSpeed(220);

        RaceCar rc2 = new RaceCar();
        rc2.display();
    }
}