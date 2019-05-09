import java.util.*;
public class SphereVolume {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        System.out.println("Let's calculate the volume of a sphere!\nWhat is the radius of the sphere?");
        double r = keys.nextDouble();
        double V = ((4.0/3.0)*Math.PI*Math.pow(r,3));
        System.out.printf("The volume of the sphere is %.2f!", V);
    }
}
