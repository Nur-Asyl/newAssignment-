package Person;

import java.util.Date;
import things.Book;
import things.Phone;

public class Reader {
    private String fullName, faculty;
    private long libraryCardNumber;
    private Date dateOfBirth;
    private Phone phone;

    public Reader(String fullName, String faculty, long libraryCardNumber, Date dateOfBirth, Phone phone) {
        this.fullName = fullName;
        this.faculty = faculty;
        this.libraryCardNumber = libraryCardNumber;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public void takeBook(int numberOfBooks){
        System.out.println(this.fullName + " took " + numberOfBooks + " books");
    }

    public void takeBook(String ... numberOfBookTitles){
        System.out.print(this.fullName + " took books: ");
        for(String s: numberOfBookTitles){
            System.out.print(s + ", ");
        }
        System.out.println();
    }

    public void takeBook(Book... books){
        System.out.print(this.fullName + " took books: ");
        for(Book s: books){
            System.out.print(s.getName() + ", ");
        }
        System.out.println();
    }

    public void returnBook(int numberOfBooks){
        System.out.println(this.fullName + " return " + numberOfBooks + " books");
    }

    public void returnBook(String ... numberOfBookTitles){
        System.out.print(this.fullName + " return books: ");
        for(String s: numberOfBookTitles){
            System.out.print(s + ", ");
        }
        System.out.println();
    }

    public void returnBook(Book... books){
        System.out.print(this.fullName + " return books: ");
        for(Book s: books){
            System.out.print(s.getName() + ", ");
        }
        System.out.println();
    }

}
