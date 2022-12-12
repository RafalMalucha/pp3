package ex1;
import java.util.HashSet;
import java.util.Set;

public class Numbers{

    private int int1;
    private int int2;
    private int int3;
    private int int4;
    private int int5;

    Numbers(int int1, int int2, int int3, int int4, int int5){
        this.int1 = int1;
        this.int2 = int2;
        this.int3 = int3;
        this.int4 = int4;
        this.int5 = int5;
    }

    public boolean different(){

        int[] numbers = {int1, int2, int3, int4, int5};
        Set<Integer> numbersFound = new HashSet<Integer>();

        for (int number : numbers){
            if (numbersFound.contains(number)){
                return false;
            }
            numbersFound.add(number);
        }
        return true;
    }

    public static void main(String[] args) {
        Numbers n1 = new Numbers(1, 2, 3, 4, 5);
        System.out.println(n1.different());

        Numbers n2 = new Numbers(1, 1, 3, 4, 5);
        System.out.println(n2.different());
    }
}
