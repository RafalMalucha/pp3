public class task23 {

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
            this.guestName = guestName;
        }

        void checkout(){
            this.occupied = false;
        }

        boolean isOccupied(){
            return occupied;
        }

        public String toString() {
            return "number: " + this.number +
            "beds: " + this.beds +
            "occupied: " + this.occupied + 
            "guest name: " + this.guestName;

        }

        static void specificRoomsReport(int beds, Room[] rooms){
            for(Room room : rooms){
                if (room.beds == beds){
                    room.toString();
                }
            }
        }

        static void vacantOrOccupied(Room[] rooms){
            int occupiedRooms = 0;
            int vacantRooms = 0;
            for(Room room : rooms){
                if(room.occupied == true){
                    occupiedRooms++;
                } else {
                    vacantRooms++;
                }
            }
            System.out.println("Occupied rooms: "+occupiedRooms);
            System.out.println("Vacant rooms:"+vacantRooms);
            System.out.println("");
        }

        static void vacantBeds(Room[] rooms){
            int vacantBeds = 0;
            for(Room room : rooms){
                if(room.occupied == false){
                    vacantBeds += room.beds; 
                }
            }
            System.out.println("Vacant beds: "+vacantBeds);
            System.out.println("");
        }  
    } 

    public static void main(String[] args){
        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Room r3 = new Room(3);
        Room r4 = new Room(4, 3);
        Room r5 = new Room(5, 3);
        Room r6 = new Room(6, 1);

        Room[] rooms = new Room[6];
        rooms[0] = r1;
        rooms[1] = r2;
        rooms[2] = r3;
        rooms[3] = r4;
        rooms[4] = r5;
        rooms[5] = r6;

        rooms[0].toString();

        for(Room room : rooms){
            room.toString(); 
        }

        Room.specificRoomsReport(2, rooms);

        Room.vacantOrOccupied(rooms);

        Room.vacantBeds(rooms);
    }
}
