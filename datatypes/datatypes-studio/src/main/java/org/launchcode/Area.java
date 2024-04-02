package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        Double radius = input.nextDouble();
        if (radius < 0 || radius.isNaN()) {
            System.out.println("Please enter a positive integer.");
            System.exit(0);
        }

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + "is: " + area);
a
        input.close();
    }
}
