public class test {
    public static void main(String[] args) {
        SuperCounter sc1 = new SuperCounter(55);
        sc1.addN(5);
        System.out.println(sc1.getCounter());
    }
}
