public class task22 {
    
    public static class Room{

        int number;
        int beds;
        boolean occupied;
        String guestName;

        Room(int number){
            this.number = number;
            this.beds = 2;
        }

        Room(int number, int beds){
            this.number = number;
            this.beds = beds;
        }

        void checkin(String guestName){
            this.occupied = true;
        }

        void checkout(){
            this.occupied = false;
        }

        boolean isOccupied(){
            return occupied;
        }

        void displayStatus(){
            System.out.println("Number: "+this.number);
            System.out.println("Beds: "+this.beds);
            System.out.println("Occupied: "+this.occupied);
            System.out.println("Guest Name: "+this.guestName);
        }
    }

    public static void main(String[] args){

    }
}
