package Person;

public class Aspirant extends Student {
    String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public int getScholarship(){
        return (this.getAverageMark() == 5) ? 200 : 180;
    }

}
