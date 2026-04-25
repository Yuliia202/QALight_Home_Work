package java_hw_42;

public class BankAccount {
    public static void main(String[] args) {

        BankComponents client = new BankComponents(123456, "Yulia", 100);

        client.printInfo();

        client.deposit(1000);

        client.withdraw(300);

        client.withdraw(9999);

        client.deposit(-100);


    }
}
