public class Counter {
    private int counter;

    Counter(int counter){
        this.counter=counter;
    }

    public void add1(){
        counter++;
    }

    public int getCounter(){
        return counter;
    }
  }
  