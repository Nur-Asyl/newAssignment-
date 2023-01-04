package Animal;

public class Cat extends Animal {
    private String breed;
    public Cat(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    public void makeNoise(){
        System.out.println("Meow!");
    }
    public void eat(){
        System.out.println("Cat is eating");
    }
    public void sleep(){
        System.out.println("Cat is sleeping");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
