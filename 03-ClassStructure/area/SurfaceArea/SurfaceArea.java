public class SurfaceArea{
    
    public static double rectangleArea(int a, int b){
        return a * b;
    }
    
    public static double circleArea(float radius){
        return 3.14f * radius * radius;
    }
    
    public static double triangleArea(int base, int height){
        return base * height / 2;
    }
    
    public static void main(String[] args){
        
        double rectangle = rectangleArea(4, 5);
        double circle = circleArea(3);
        double triangle = triangleArea(3, 4);
        
        System.out.println(rectangle);
        System.out.println(circle);
        System.out.println(triangle);
    }
}