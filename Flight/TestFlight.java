package Flight;

public class TestFlight {
    public static void main(String args[]) {

        Flight s1 = new Flight(857, "Toronto");
        System.out.println(s1.getNumber());
        System.out.println(s1.getDestination());
        s1.display();
    }
}
