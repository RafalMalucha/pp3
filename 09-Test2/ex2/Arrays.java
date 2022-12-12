package ex2;
public class Arrays {
    static boolean arr(int[] arr1, int[] arr2){
        int counter1 = 0;
        int counter2 = 0;
        for (int number : arr1) {
            if (number >= 10 && number <= 99){
                counter1++;
            }
        }
        for (int number : arr2) {
            if (number >= 10 && number <= 99){
                counter2++;
            }
        }
        if (counter1 == counter2) {
            return true;
        } else {
            return false;
        }
    }   
    public static void main(String[] args) {
        System.out.println(arr(new int[] {15,8,2,37,4,117}, new int[] {9,6,7,12,48,4,6,90,5}));
    } 
}
