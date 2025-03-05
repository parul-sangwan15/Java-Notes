package vehicledef;

public class Car{
    private String name;
    private int year;
    private String brand;

    public Car(){         // Default Contructor
        name = "Audi";
        year = 1996;
        brand = "Volkswagen";
        System.out.println("Hey!");
    }

    public Car(String n, int y, String b){     // Parametrized constructor
        name = n;
        year = y;
        brand = b;
    }

 
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }


    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }


    public void display(){
        System.out.println(getBrand() + ": " + getName() + ": " + getYear());
    }


}