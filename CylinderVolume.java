import java.util.*;
public class CylinderVolume {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        System.out.println("Let's find the volume of a cylinder!\nHow tall is the cylinder?");
        double h = keys.nextDouble();
        System.out.println("What is the radius of the cylinder?");
        double r = keys.nextDouble();
        double V = (Math.PI*Math.pow(r,2)*h);
        System.out.printf("The volume of the cylinder is %.2f!", V);
    }
}
