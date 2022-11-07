import java.util.Arrays;

public class task17 {

    public static class StudentGrades {

        String studentName;
        double[] grades;
    
        StudentGrades(String name, double[] grades) {
            this.studentName = name;
            this.grades = grades;
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
        StudentGrades s1 = new StudentGrades("Anton", new double[] {4.5, 4.0, 4.0, 3.5, 4.0, 2.0});
        StudentGrades s2 = new StudentGrades("Bartuś", new double[] {4.0, 3.5, 3.0, 5.5, 4.5, 4.0, 3.0});
        StudentGrades s3 = new StudentGrades("Marcinek", new double[] {5.0, 5.5, 4.0, 4.0, 4.5, 5.0});

        s1.displayRecord();
        s2.displayRecord();   
        s3.displayRecord();
    }
}