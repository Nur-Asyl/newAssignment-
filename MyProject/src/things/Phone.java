package things;

public class Phone {
    private String number, model;
    private double weight;

    Phone(){

    }
    Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(String number, String model, int weight){
        this(number, model);
        this.weight = weight;
    }

    public void sendMessage(String ... number){
        for (String s : number) {
            System.out.println(s);
        }
    }

    public void receiveCall(String name){
        try{
            System.out.println(name + " is ringing");
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

    }

    public void receiveCall(String name, String number){
        try{
            System.out.println(name + " with number " + number + " is ringing");
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


}
