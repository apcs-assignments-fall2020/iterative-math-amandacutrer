import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = 5.0;
        double y = 0.0;
        while(Math.abs(n - y) > 0.00001){
            double m = (n + x/n) / 2;
            double v = n; 
            n = m;
            y = (v); 
        } 
        return n; 
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
       double newAnswer = 1;
        while(x > 0){
        newAnswer = newAnswer*x;
        x--; 
        } 
    return newAnswer; 
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double e = 0;
        int x = 0; 
        while(Math.E - e > 0.00001){
            double calculator = (e + 1/(factorial(x))); 
            x++;
            e = calculator; 
        }  
        return e;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number! ");
        double number = scan.nextDouble();
        System.out.println(number);
        System.out.println("The square root of " + number + " is " + babylonian(number));
        System.out.println("The value of e is roughly : " + calculateE());

        scan.close();
    }
}
