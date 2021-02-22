package Lab03;
//imports Scanner

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        //declares variables
        double h, r, base_area, side_area; //height, length of radius, area of base, area of side
        //declares Scanner
        Scanner scan = new Scanner(System.in);

        //gets radius of right cylinder from use
        System.out.println("Enter the length of the radius for the right cylinder in feet: ");
        r = scan.nextDouble();

        //gets height of right cylinder from use
        System.out.println("Enter the height of the right cylinder in feet: ");
        h = scan.nextInt();

        //calculates base area given radius of right cylinder
        base_area = calcBaseArea(r);
        System.out.println("Base surface area of the right cylinder is " + base_area + " square feet.");

        //calculates side area given height and radius of right cylinder
        side_area = calcSideArea(h, r);
        System.out.println("Side surface area of the right cylinder is " + side_area + " square feet.");

        //prints surface area given area of base and area of side
        prntSurfArea(base_area, side_area);
    }

    //calculates base area given radius of right cylinder
    public static double calcBaseArea(double r) {
        return 2 * Math.PI * Math.pow(r, 2);
    }

    //calculates side area given height and radius of right cylinder
    public static double calcSideArea(double h, double r) {
        return h * (2 * Math.PI * r);
    }

    //prints surface area given area of base and area of side
    public static void prntSurfArea(double baseArea, double sideArea) {
        System.out.println("The total surface area of the right cylinder is " + (baseArea + sideArea) + " square feet.");
    }
}
