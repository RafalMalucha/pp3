public class lamp {
    
    //attributes
    boolean isOn;

    //methods
    public void turnOn(){
        isOn = true;
    };
    public void turnOff(){
        isOn = false;
    };
    public void displayInfo(){
        if (isOn == true) {
            System.out.println("lamp is on");
        } else {
            System.out.println("lamp is off");
        }
    };
    public static void main(String[] args) {
        lamp lamp1 = new lamp();
        lamp lamp2 = new lamp();
        lamp1.turnOn();
        lamp2.turnOff();
        lamp1.displayInfo();
        lamp2.displayInfo();
    }
}   
