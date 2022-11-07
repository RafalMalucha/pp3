public class task20 {
    
    public static class Clock {

        int hour;
        int minute;

        Clock(){
            this.hour = 0;
            this.minute = 0;
        }

        Clock(int hour, int minute){
            this.hour = hour;
            this.minute = minute;
            if(this.hour > 23){
                this.hour = 23;
            }
            if(this.hour < 0){
                this.hour = 0;
            }
            if(this.minute > 59){
                this.minute = 59;
            }
            if(this.minute < 0){
                this.minute = 0;
            }
        }

        void setClock(){
            this.hour = 0;
            this.minute = 0;
        }

        void setClock(int hour, int minute){
            this.hour = hour;
            this.minute = minute;
        }

        void addOneMinute(){
            this.minute += 1;
            if (this.minute > 59){
                this.minute = 0;
                this.hour += 1;
                if(this.hour > 23){
                    this.hour = 0;
                }
            }
        }

        void displayTime(){
            System.out.println("Time: "+this.hour+":"+this.minute);
            System.out.println("");
        }
    }
    public static void main(String[] args){
        Clock c1 = new Clock(12, 47);

        c1.displayTime();
        c1.setClock(18, 14);
        c1.displayTime();
        c1.setClock(9, 3);
        c1.displayTime();
        c1.setClock(23, 58);
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();
    }
}
