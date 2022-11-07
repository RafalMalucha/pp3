public class stats {
    
    public static int NumbersInRange(int x, int y){
        int range = 0;
        for (int i = x; i <= y; i++) {
            range++;
        }
        return range;
    }

    public static int MeanInRange(int x, int y){
        int sum = 0;
        int range = 0;
        for (int i = x; i <= y; i++) {
            sum = sum + i;
            range++;
        }
        return (sum / range);
    }

    public static int SumInRange(int x, int y){
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args){
        int bb = NumbersInRange(5, 10);
        int cc = SumInRange(5, 10);
        int dd = MeanInRange(5, 10);

        System.out.println(bb);
        System.out.println(cc);
        System.out.println(dd);
    }
}
