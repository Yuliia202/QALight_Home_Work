//Створіть клас BankAccount з полями: номер рахунку, ім'явласника, баланс (private).
//Додайте методи для поповнення та зняття коштів.
//Додайте перевірку, щоб не можна було зняти більше, ніж є на рахунку.
//Створіть об'єкт, протестуйте методи.

package java_hw_42;

public class BankComponents {
    private int numberOfAccount;
    private String name;
    private int balance;

    public BankComponents(int numberOfAccount, String name, int balance) {
        this.numberOfAccount = numberOfAccount;
        this.name = name;
        this.balance = balance;
    }

    public int getNumberOfAccount() { return numberOfAccount;}

    public String getName() { return name; }

    public int getBalance() { return balance; }

    public void setBalance(int balance) { this.balance = balance; }

    public void setName(String name) { this.name = name; }

    public void setNumberOfAccount(int numberOfAccount) { this.numberOfAccount = numberOfAccount; }


    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Помилка: сума поповнення має бути більше нуля.");
            return;
        }
        balance += amount;
        System.out.println("Поповнено на " + amount + " грн. Баланс: " + balance + " грн");
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Помилка: сума зняття має бути більше нуля.");
            return;
        }
        if (amount > balance) {
            System.out.println("Помилка: недостатньо коштів. Баланс: " + balance + " грн");
            return;
        }
        balance -= amount;
        System.out.println("Знято " + amount + " грн. Баланс: " + balance + " грн");
    }

    public void printInfo() {
        System.out.println("Рахунок №" + numberOfAccount + " | " + name + " | Баланс: " + balance + " грн");
    }


}


