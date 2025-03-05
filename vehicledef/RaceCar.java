package vehicledef;
public class RaceCar extends Car {
    
    private float engine;
    private int maxSpeed;

    public RaceCar(){
        engine = 1.6f;
        maxSpeed = 360;
        System.out.println("Hi");
    }

    public RaceCar(float engine, int maxSpeed){
        this.engine = engine;
        this.maxSpeed = maxSpeed;
    }

    public float getEngine() {
        return engine;
    }
    public void setEngine(float engine) {
        this.engine = engine;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void show(){
        System.out.println(getEngine() + ": " + getMaxSpeed());
    }
}