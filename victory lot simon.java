import java.util.Scanner;

public class KinematicEquation {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Enter the initial velocity:");
      double v0 = input.nextDouble();

      System.out.println("Enter the acceleration:");
      double a = input.nextDouble();

      System.out.println("Enter the time:");
      double t = input.nextDouble();

      double vf = v0 + a*t;

      System.out.println("The final velocity is: " + vf);
    }
  }
}
