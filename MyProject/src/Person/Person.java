package Person;

public class Person {
    private String fullName;
    private int age;

    public Person(){

    }
    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        try {
            System.out.println(this.fullName + ", " + this.age + " years old is moving");
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    public void talk(){
        try{
            System.out.println(this.fullName + ", " + this.age + " years old is talking");
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
