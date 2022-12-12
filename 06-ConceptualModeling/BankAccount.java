public class BankAccount {

    private String owner;
    private String number;
    private int balance;

    public BankAccount(String owner, String number) {
        this.owner = owner;
        this.number = number;
        this.balance = 0;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (amount > 500) {
            System.out.println("2 much monys?");
        } else if (amount > this.balance) {
            System.out.println("no monys?");
        } else {
            this.balance -= amount;
        }
    }
    
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("borys karton", "17624871258237587356");
        b1.deposit(500);
        System.out.println(b1.getBalance());
        b1.deposit(200);
        System.out.println(b1.getBalance());
        b1.withdraw(1000);
        System.out.println(b1.getBalance());
        b1.withdraw(300);
        System.out.println(b1.getBalance());
        b1.withdraw(450);
        System.out.println(b1.getBalance());
    }
}
