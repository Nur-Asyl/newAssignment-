package Animal;

public class Horse extends Animal {
    private float speed;
    public Horse(String food, String location, float speed) {
        super(food, location);
        this.speed = speed;
    }

    public void makeNoise(){
        System.out.println("Arigato!");
    }
    public void eat(){
        System.out.println("Horse is eating");
    }
    public void sleep(){
        System.out.println("Horse is sleeping");
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}
