public class bankAccount {
    
    //attributes
    String owner;
    float amountOfMoney;
    int amountOfTransactions;
    String date;
    boolean isPersonal;

    //methods
    public void displayInfo(){
        System.out.println("Owner: "+owner);
        System.out.println("Money: "+amountOfMoney);
        System.out.println("Transactions: "+amountOfTransactions);
        System.out.println("Date of registration: "+date);
        System.out.println("Is personal: "+isPersonal);
        System.out.println("");
    };
    public void Transaction(int amount){
        amountOfMoney += amount;
        amountOfTransactions++;
        System.out.println("Transaction complete");
        System.out.println("");  
    };
    public void doFlip(){
        System.out.println("does a flip");
    };

    public static void main(String[] args){
        bankAccount a1 = new bankAccount();
        a1.owner = "Joe Doe";
        a1.amountOfMoney = 0;
        a1.amountOfTransactions = 0;
        a1.date = "19.10.2022";
        a1.isPersonal = true;
        
        a1.displayInfo();
        a1.doFlip();
        a1.Transaction(1000);
        a1.displayInfo();
        a1.Transaction(-200);
        a1.displayInfo();
    };
}
