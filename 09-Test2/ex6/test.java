public class test {
    public static void main(String[] args) {
        Car c1 = new Car(2, 350);
        Car c2 = new Car(5, 200);
        System.out.println(c1.spec()[0] + " " + c1.spec()[1]);
        System.out.println(c2.spec()[0] + " " + c2.spec()[1]);
    }
}
