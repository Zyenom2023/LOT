import java.util.Scanner;

public class PhysicsCalculation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Get input from user
    System.out.println("Enter the initial velocity: ");
    double v0 = input.nextDouble();
    
    System.out.println("Enter the acceleration: ");
    double a = input.nextDouble();
    
    System.out.println("Enter the time: ");
    double t = input.nextDouble();
    
    // Calculate final velocity
    double vf = v0 + a*t;
    
    // Output result
    System.out.println("The final velocity is: " + vf);
  }
}
