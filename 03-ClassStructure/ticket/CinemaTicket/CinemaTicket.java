public class CinemaTicket {
    
    //attributes
    String cinemaName;
    String filmTitle;
    int row;
    int seat;
    int price;
    
    public void DisplayInfo(){
        System.out.println("Cinema name: "+cinemaName);
        System.out.println("Film name: "+filmTitle);
        System.out.println("Row: "+row);
        System.out.println("Seat: "+seat);
        System.out.println("Price: "+price);
    }
    
    public CinemaTicket(String movie, int s, int r){
        cinemaName = "Morning star cinema";
        filmTitle = movie;
        row = r;
        seat = s;
        if(r>2) {
            price = 25;
        } else {
            price = 10;
        }
    }
    
    public static void main(String[] args){
        CinemaTicket t1 = new CinemaTicket("Gladiator", 2, 2);
        CinemaTicket t2 = new CinemaTicket("Gladiator", 5, 5);
        
        t1.DisplayInfo();
        t2.DisplayInfo();
    }
}