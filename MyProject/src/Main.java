import Person.Person;

import java.util.Date;
import java.util.Scanner;
import Person.*;
import things.*;
import Animal.*;

public class Main {
    public static boolean ACTIVATE = true;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(ACTIVATE){
            System.out.println("1) phone\n" +
                    "2) person\n" +
                    "3) matrix\n" +
                    "4) reader\n" +
                    "5) print all numbers\n" +
                    "6) student\n" +
                    "7) animal\n" +
                    "Choose task:");
            String opt = sc.next();
            switch (opt){
                case "1":
                    phone();
                    break;
                case "2":
                    person();
                    break;
                case "3":
                    matrix();
                    break;
                case "4":
                    reader();
                    break;
                case "5":
                    printAllNumbersFunc();
                    break;
                case "6":
                    student();
                    break;
                case "7":
                    animal();
                    break;
                default:
                    ACTIVATE = false;
            }
        }
        sc.close();
    }

    public static void phone(){
        System.out.println("things.Phone class:");
        Phone p1 = new Phone("+77751509457", "IPhone 12", 57);
        Phone p2 = new Phone("+77751509458", "IPhone 13", 60);
        Phone p3 = new Phone("+77751509459", "IPhone 14 Pro Max Ultra Plus", 65);

        System.out.println("Number: " + p1.getNumber() + "; model: " + p1.getModel() + "; weight:" + p1.getWeight());
        System.out.println("Number: " + p2.getNumber() + "; model: " + p2.getModel() + "; weight:" + p2.getWeight());
        System.out.println("Number: " + p3.getNumber() + "; model: " + p3.getModel() + "; weight:" + p3.getWeight());

        System.out.println("\nReceive call:");
        p1.receiveCall("Almas");
        p2.receiveCall("Teacher");
        p3.receiveCall("Mom");

        System.out.println("\nOverload receive call:");
        p1.receiveCall("Almas", p2.getNumber());

        System.out.println("\nSend message:");
        p1.sendMessage(p2.getNumber(), p3.getNumber());

    }

    public static void person(){
        System.out.println("Person.Person class:");
        Person person1 = new Person();
        Person person2 = new Person("Abay", 17);
        person2.move();
        person2.talk();
    }

    public static void matrix(){
        System.out.println("things.Matrix class:");
        System.out.println("things.Matrix multiplication:");
        Matrix m1 = new Matrix(2, 3);
        Matrix m2 = new Matrix(3, 2);
        m1.setMatrix(m1.matrixMultiplication(m2));

        m1.printout();
    }

    public static void reader(){
        Phone p1 = new Phone("+77751509457", "IPhone 12", 57);
        Date dateOfBirth = new Date(2004, 06, 21);
        Reader r1 = new Reader("Petrov VV", "IT", 220083, dateOfBirth, p1);
        Book b1 = new Book("Patterns", "Almas");
        Book b2 = new Book("Clean code", "Iliyas");
        Book b3 = new Book("Art of programming", "Donald Knuth");

        r1.takeBook(3);
        r1.takeBook("Art of programming", "Solid principles", "reactive programming", "composition in java");
        r1.takeBook(b1, b2, b3);
    }

    public static void printAllNumbersFunc(){
        System.out.println("Enter interval:");
        int A = sc.nextInt();
        int B = sc.nextInt();
        printAllNumbers(A, B);
    }

    public static void printAllNumbers(int A, int B){
        if(A < B){
            if(A > B){
                System.out.println(A);
                return;
            }
            System.out.print(A + " ");
            printAllNumbers(++A, B);
        }else if(A > B){
            if(A < B){
                System.out.println(A);
                return;
            }
            System.out.print(A + " ");
            printAllNumbers(--A, B);
        }else if(A == B){
            System.out.println(A);
        }
    }

    public static void student(){
        Student[] students = new Student[2];
        Student s1 = new Student("Nur-Asyl", "Kanagatov", "SE-2207", 4);
        Student s2 = new Student("Zhiga", "Zhanbyrbai", "SE-2202", 5);
        students[0] = s1;
        students[1] = s2;
        for(Student s : students){
            System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getGroup() + " the scholarships amount is " + s.getScholarship());
        }
    }

    public static void animal(){
        Dog dog = new Dog("bone", "Your house", "haski");
        Cat cat = new Cat("mice", "Your second house", "Britain");
        Horse horse = new Horse("grass", "anywhere", 207.5f);
        Animal[] animals = new Animal[3];
        animals[0] = dog;
        animals[1] = cat;
        animals[2] = horse;

        Veterinary vet = new Veterinary("Aibolit", 65);
        for(Animal a : animals){
            vet.treatAnimal(a);
        }
    }

}

