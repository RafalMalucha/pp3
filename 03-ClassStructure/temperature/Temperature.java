public class Temperature {
    
    public static double CelsiusToKelvin(int C){
        return (C + 273.15);
    };

    public static double CelsiusToFahrenheit(int C){
        return (C * (9.0 / 5.0) + 32);
    };

    public static double FahrenheitToKelvin(int F){
        return ((F + 459.67) * (5.0 / 9.0));
    };

    public static double FahrenheitToCelsius(int F){
        return ((F - 32) * (5.0 / 9.0));
    };

    public static double KelvinToCelsius(int K){
        return (K - 273.15);
    };

    public static double KelvinToFahrenheit(int K){
        return (K * (9.0 / 5.0) - 459.67);
    };

    public static void main(String[] args){

        double cToK = CelsiusToKelvin(25);
        double cToF = CelsiusToFahrenheit(25);
        double fToK = FahrenheitToKelvin(100);
        double fToC = FahrenheitToCelsius(100);
        double kToC = KelvinToCelsius(0);
        double kToF = KelvinToFahrenheit(0);

        System.out.println("25C to K: "+cToK);
        System.out.println("25C to F: "+cToF);
        System.out.println("100F to K: "+fToK);
        System.out.println("100F to C: "+fToC);
        System.out.println("0K to C: "+kToC);
        System.out.println("0K to F: "+kToF);
    }
}
