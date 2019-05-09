import java.util.*;
public class Hypotenuse2 {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        System.out.println("Let's calculate the hypotenuse of a right triangle!\nWhat is the length of the first side?");
        double x = keys.nextDouble();
        System.out.println("What is the length of the second side?");
        double y = keys.nextDouble();
        double z = Math.sqrt((Math.pow(x,2)+(Math.pow(y,2))));
        System.out.println("The hypotenuse is " + z + "!");
    }

}
