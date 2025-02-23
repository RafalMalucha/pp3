import java.util.Scanner;
import java.util.Arrays;

public class task19 {

    public static class StudentGrades {

        String studentName;
        double[] grades = {};
    
        StudentGrades(String name, double[] grades) {
            this.studentName = name;
            this.grades = grades;
        }

        void addGrade(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Add grade: ");
            double grade = scan.nextDouble();
            this.grades = Arrays.copyOf(grades, grades.length + 1);
            this.grades[grades.length - 1] = grade;
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
        double[] grades = {};
        StudentGrades s1 = new StudentGrades("Anton", grades);

        s1.addGrade();
        s1.addGrade();
        s1.addGrade();
        s1.addGrade();

        s1.displayRecord();
    }
}

