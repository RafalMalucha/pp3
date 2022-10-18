public class Student {
    
    //wykaz atrybutów
    String name;
    int age;
    String id;
    boolean isValid;
    int semester;
    float averageGrade;
    
    //wykaz metod
    public void sayHello(){
        System.out.println("Hello");
    };
    public void displayName(){
        System.out.println("My name is "+name);
    };
    public void displayAge(){
        System.out.println("I am "+age+" years old");
    };
    public void displayStudentInfo(){
        System.out.println("Name: "+name);
        System.out.println("Semester: "+semester);
        System.out.println("AverageGrade: "+averageGrade);
        System.out.println("");
    };
    public void isValidChange(){
        isValid = !isValid;  
    };
    public void displayIdInfo(){
        System.out.println("Name: "+name);
        System.out.println("Id number: "+id);
        System.out.println("Is Id valid: "+isValid);
        System.out.println("");
    };
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rafał";
        s1.age = 19;
        s1.id = "220986";
        s1.semester = 3;
        s1.averageGrade = 3.0f;
        s1.isValid = false;
        
        s1.displayStudentInfo();
        s1.displayIdInfo();
        s1.isValidChange();
        s1.displayIdInfo();
    };
    
}