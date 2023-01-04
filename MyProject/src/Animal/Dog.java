package Animal;

public class Dog extends Animal {
    private String breed;
    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    public void makeNoise(){
        System.out.println("Gav!");
    }
    public void eat(){
        System.out.println("Dog is eating");
    }
    public void sleep(){
        System.out.println("Dog is sleeping");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
