//imports Scanner

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        //declares variables
        double height, radius, base_area, side_area; //height, length of radius, area of base, area of side
        //declares Scanner
        Scanner scan = new Scanner(System.in);

        //gets radius of right cylinder from use
        System.out.println("Enter the length of the radius for the right cylinder in feet: ");
        radius = scan.nextDouble();

        //gets height of right cylinder from use
        System.out.println("Enter the height of the right cylinder in feet: ");
        height = scan.nextInt();

        //calculates base area given radius of right cylinder
        base_area = calcBaseArea(radius);
        System.out.printf("Base surface area of the right cylinder is " + "%.3f" + " square feet.\n", base_area);

        //calculates side area given height and radius of right cylinder
        side_area = calcSideArea(height, radius);
        System.out.printf("Side surface area of the right cylinder is " + "%.3f" + " square feet.\n", side_area);
        //prints surface area given area of base and area of side
        prntSurfArea(base_area, side_area);
    }

    /**
     * Takes in a radius and returns the Surface area of the base of a right cylinder.
     * @param radius takes the radius as a parameter
     * @return returns the base area of a right cylinder
     */
    public static double calcBaseArea(double radius) {
        return 2 * Math.PI * Math.pow(radius, 2);
    }

    //calculates side area given height and radius of right cylinder

    /**
     * Takes in a radius and returns the surface area of the side of a right cylinder.
     * @param height takes in height of a right cylinder
     * @param radius takes in the radius of a right cylinder
     * @return area of the side surface area of a right cylinder
     */
    public static double calcSideArea(double height, double radius) {
        return height * (2 * Math.PI * radius);
    }

    /**
     * Takes in base area and side area of a right cylinder and prints total surface area of a right cylinder
     * @param baseArea takes in a base area of a right cylinder
     * @param sideArea takes in a side area of a right cylinder
     */
    //prints surface area given area of base and area of side
    public static void prntSurfArea(double baseArea, double sideArea) {
        System.out.printf("The total surface area of the right cylinder is " + "%.3f" + " square feet.",(baseArea + sideArea));
    }
}
