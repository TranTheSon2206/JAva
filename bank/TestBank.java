package bank;

public class TestBank {
    public static void main(String[] args) {
        Bank account101=new Bank(2001,0.5);
        double interest101= account101.calculateInterest();
        System.out.println("Your interest is: "+interest101);
    }
}
