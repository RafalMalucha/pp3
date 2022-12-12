public class test {
    public static void main(String[] args) {
        Person p1 = new Person("a", 12);
        Person p2 = new Person("b", 18);
        Person p3 = new Person("c", 20);
        Person[] pp = {p1, p2, p3};    
        Family f1 = new Family(pp);
        System.out.println(f1.adult());
    }
}
