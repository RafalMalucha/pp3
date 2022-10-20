public class Smartphone {
    
    //attributes
    String model;
    int memory;
    int systemVersion;
    boolean isOn;
    int batteryPercent;

    //methods
    public void displayInfo(){
        System.out.println("Model: "+model);
        System.out.println("System: "+systemVersion);
        System.out.println("Battery percentage: "+batteryPercent);
        System.out.println("Memory: "+memory);
        System.out.println("Is on: "+isOn);
    };
    public void switchOnOff(){
        isOn = !isOn;
    };
    public void updateSystem(){
        systemVersion++;
        System.out.println("System updated to version: "+systemVersion);
    };

    public static void main(String[] args) {
        Smartphone s1 = new Smartphone();
        s1.model = "telefon";
        s1.memory = 64;
        s1.systemVersion = 12;
        s1.isOn = false;
        s1.batteryPercent = 100;

        s1.displayInfo();
        s1.switchOnOff();
        s1.displayInfo();
        s1.updateSystem();
        s1.displayInfo();
        s1.updateSystem();
        s1.updateSystem();
        s1.updateSystem();
        s1.displayInfo();
        s1.switchOnOff();
    };
}
