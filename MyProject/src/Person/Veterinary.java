package Person;
import Animal.*;

public class Veterinary extends Person{
    public Veterinary(String fullName, int age) {
        super(fullName, age);
    }
    public void treatAnimal(Animal animal){
        System.out.println("Food: " + animal.getFood() + "\nLocation: " + animal.getLocation());
    }

}
