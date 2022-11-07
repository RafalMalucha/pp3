public class task16 {
    
    static class InternetDevice {
        String name;
        boolean connected = false;
        static int connectedDevices = 0;

        InternetDevice(String name){
            this.name = name;
        }

        void connect() {
            this.connected = true;
            connectedDevices++;
        }

        void disconnect() {
            this.connected = false;
            connectedDevices--;
        }

        boolean isConnected() {
            return this.connected;
        }

        void displayStatus() {
            System.out.println("name: "+this.name);
            System.out.println("Status: "+this.connected);
            System.out.println("\n");
        }

        static void displayConnections(){
            System.out.println("Connected devices: "+connectedDevices);
        }
    }

    public static void main(String[] args){
        InternetDevice d1 = new InternetDevice("Smartphone");
        InternetDevice d2 = new InternetDevice("Laptop");
        InternetDevice d3 = new InternetDevice("PC");
        InternetDevice d4 = new InternetDevice("Playstation");
        InternetDevice d5 = new InternetDevice("TV");

        d1.connect();
        d2.connect();
        d3.connect();

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
        d4.displayStatus();
        d5.displayStatus();

        InternetDevice.displayConnections();
    }
}
