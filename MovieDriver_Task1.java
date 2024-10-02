import java.util.Scanner;

public class MovieDriver_Task1 {
    public static void main(String[] args) {
        // Create a Scanner object for reading input from the keyboard
        Scanner scanner = new Scanner(System.in);
        
        // Create a new movie object
        Movie movie = new Movie();
        
        // Prompt the user to enter the title of the movie
        System.out.println("Enter the name of the movie ");
        String title = scanner.nextLine();
        movie.setTitle(title); // Set the title in the movie object
        
        // Prompt the user to enter the movie's rating
        System.out.println("Enter the rating of the movie ");
        String rating = scanner.nextLine();
        movie.setRating(rating); // Set the rating in the movie object
        
        // Prompt the user to enter the number of tickets sold at a theater
        System.out.println("Enter the number of tickets sold for this movie ");
        int ticketsSold = scanner.nextInt();
        movie.setSoldTickets(ticketsSold); // Set the number of tickets sold in the movie object
        
        // Print out the information using the movie's toString method
        System.out.println("\nGoodbye");
        
        
        // Close the scanner
        scanner.close();
    }
}
