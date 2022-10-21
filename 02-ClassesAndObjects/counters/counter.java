public class counter {

    int value = 0;

    public void add1(){
        value++;
    }
    public void minus1(){
        value--;
    }
    public void add10(){
        value = value + 10;
    }
    public void minus10(){
        value = value - 10;
    }
    public void curretnValue(){
        System.out.println(value);
    }
    public static void main(String[] args){
        counter c1 = new counter();
        c1.add10();
        c1.add10();
        c1.add1();
        c1.add1();
        c1.add1();

        counter c2 = new counter();
        c2.minus10();
        c2.minus10();
        c2.minus10();
        c2.minus10();
        c2.minus10();
        c2.add1();
        c2.add1();
        c2.add1();

        c1.curretnValue();
        c2.curretnValue();
    }
}
