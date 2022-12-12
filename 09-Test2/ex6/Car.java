public class Car extends Vehicle{

    public Vehicle vehicle;
    int maxSpeed;

    public Car(int seats, int maxSpeed){
        super(seats);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec(){
        int[] specs = new int[2];
        specs[0] = getSeats();
        specs[1] = maxSpeed;
        return specs;
    }
}
