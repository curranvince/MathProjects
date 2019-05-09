import java.util.*;
public class Hypotenuse1 {
    public static void main(String[] args) {
    Scanner keys = new Scanner(System.in);
    System.out.println("Let's calculate the hypotenuse of a right triangle!\nWhat is the first side length?");
    double x = keys.nextDouble();
    System.out.println("What is the length of the second side?");
    double y = keys.nextDouble();
    double z = Math.hypot(x,y);
    System.out.println("The hypotenuse is " + z + "!");
    }
}
