import java.util.Scanner;
public class ExamPracticeTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your favorite city: ");
        String favoriteCity = scan.nextLine();
        System.out.printf("number of characters in %s: %d", favoriteCity, favoriteCity.length());
        System.out.println("\nName of city in uppercase: " + favoriteCity.toUpperCase());
        System.out.println("Name of city in lowercase: " + favoriteCity.toLowerCase());
        System.out.println("First Character in the city: " + favoriteCity.charAt(0));
    }
}
