package Flight;

public class Flight {
    private int number;
    private String destination;

    public Flight(){
        this.number=0;
        this.destination =null;
    }

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }
    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }

    public void display() {
        System.out.println(number + ", " + destination);
    }
}
