package Lab02;

/*
 * Author: Ben Goldstone
 * Date: 2/19/2021
 * Instructor: Professor Joseph Helsing
 * Description: Debugging Broken Code
 */
//Math does not need to be imported
//import Math;
//missing class keyword
public class Errors {
    //missing args parameter and static
    public static void main(String[] args) {
        //missing semicolon
        System.out.println("This code contains multiple errors.");
        //uses a " ' instead of ""
        System.out.print("These need to be fixed before you submit it.");
        //missing uses pow method but does not define Math class
        System.out.println(Math.pow(2, 4));
        //spelled out as our
        System.out.println("Fixed by Ben Goldstone.");
    }
}