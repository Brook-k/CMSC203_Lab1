import java.util.Scanner;

public class MovieDriver_Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String continueInput;

        do {
            
            Movie movie = new Movie();
            
            
            System.out.print("Enter the name of the movie \n");
            String title = scanner.nextLine();
            movie.setTitle(title); 
            
            
            System.out.print("Enter the rating of the movie \n");
            String rating = scanner.nextLine();
            movie.setRating(rating); 
            
            
            System.out.print("Enter the number of tickets sold for this movie \n");
            int ticketsSold = scanner.nextInt();
            movie.setSoldTickets(ticketsSold); 
            
            
            System.out.println("\nMovie Details");
            System.out.println(movie.toString());
            
            
            scanner.nextLine(); 
            
            
            System.out.print("Do you want to enter another movie? (yes or no) \n");
            continueInput = scanner.nextLine();
            
        } while (continueInput.equalsIgnoreCase("yes")); 
        
        System.out.println("Goodbye");
       
        scanner.close();
    }
}
