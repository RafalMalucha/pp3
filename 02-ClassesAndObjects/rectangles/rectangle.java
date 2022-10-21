public class rectangle {

    //attributes
    int a;
    int b;

    public void displayInfo(){
        int perimeter = 2 * a + 2 * b;
        int surface = a * b;
        System.out.println("side 1: "+a);
        System.out.println("side 2: "+b);
        System.out.println("perimeter: "+perimeter);
        System.out.println("surface: "+surface);
    };
    public static void main(String[] args){
        rectangle r1 = new rectangle();
        r1.a = 3;
        r1.b = 4;

        rectangle r2 = new rectangle();
        r2.a = 2;
        r2.b = 7;

        r1.displayInfo();
        r2.displayInfo();
    };
}
