package Animal;

public class Animal {
    private String food, location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise(){
        System.out.println("Animal's voice");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
