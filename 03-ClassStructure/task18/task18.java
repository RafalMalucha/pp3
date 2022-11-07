import java.util.Arrays;
import java.util.Random;

public class task18 {

    public static class StudentGrades {

        String studentName;
        double[] grades;
    
        StudentGrades(String name, int numOfGrades) {
            this.studentName = name;
            this.grades = new double[numOfGrades];
            for (int i = 0; i < numOfGrades; i++) {
                double grade = Math.round(Math.random() * (5.5 - 2.0) + 2.0);
                Random random = new Random();
                int rand = random.nextInt();
                if (rand % 2 == 0) {
                    grade += 0.5;
                } else {
                    grade += 0.0;
                }
                this.grades[i] = grade;
            }   
        }

        double lowestGrade(){
            double low[] = this.grades;
            Arrays.sort(low);

            return low[0];
        }
    
        double highestGrade(){
            double high[] = this.grades;
            Arrays.sort(high);

            return high[high.length - 1];
        }
    
        int numOfGrades(){
            return this.grades.length;
        }
    
        double gradeAverage(){
            double sum = 0;
            for (double grade : this.grades){
                sum += grade;
            }
            return sum / numOfGrades();
        }
    
        void displayRecord(){
            System.out.println("Student Name: "+this.studentName);
            System.out.println("List of grades: "+Arrays.toString(this.grades));
            System.out.println("Number of grades: "+this.numOfGrades());
            System.out.println("Lowest grade: "+lowestGrade());
            System.out.println("Highest grade: "+highestGrade());
            System.out.println("Grade Average: "+gradeAverage());
            System.out.println("");
        }
    }

    public static void main(String[] args){
        StudentGrades s1 = new StudentGrades("Anton", 5);
        StudentGrades s2 = new StudentGrades("Bartuś", 7);
        StudentGrades s3 = new StudentGrades("Marcinek", 10);

        s1.displayRecord();
        s2.displayRecord();   
        s3.displayRecord();
    }
}