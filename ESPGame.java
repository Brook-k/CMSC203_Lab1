import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("CMSC203 Assignment1: Test your ESP skills!");

        System.out.print("Enter the filename: ");
        String filename = scanner.nextLine();
        File file = new File("C:\\Users\\kifle\\OneDrive\\Desktop\\colors.txt");

        Scanner fileScanner = new Scanner(file);
        
        System.out.println("There are sixteen colors from the file:");
        while (fileScanner.hasNextLine()) {
            System.out.println(fileScanner.nextLine().trim());
        }
        
        fileScanner.close();
        fileScanner = new Scanner(file);
        
        int correctGuesses = 0;
        Random random = new Random();
        for (int round = 1; round <= 3; round++) {
            System.out.println("\nRound " + round);
            System.out.println("I am thinking of a color.");
            System.out.println("Is it one of list of colors above?");
            System.out.println("Enter your guess: ");
            String userGuess = scanner.nextLine().trim().toLowerCase();

            int randomColorIndex = random.nextInt(16) + 1;  
            String selectedColor = null;
            int currentLine = 1;
            
            while (fileScanner.hasNextLine()) {
                String color = fileScanner.nextLine().trim().toLowerCase();
                if (currentLine == randomColorIndex) {
                    selectedColor = color;
                    break;
                }
                currentLine++;
            }
            
            if (userGuess.equals(selectedColor)) {
                correctGuesses++;  
            }
          
            System.out.println("\nI was thinking of " + selectedColor + ".");
            
            fileScanner.close();
            fileScanner = new Scanner(file);
        }
        
        System.out.println("\nGame Over");
        System.out.println("You guessed " + correctGuesses + " out of 3 colors correctly.");
       
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.print("Describe yourself: ");
        String userDescription = scanner.nextLine();
        System.out.print("Due Date: ");
        String dueDate = scanner.nextLine();
        
        System.out.println("\nUser Name: " + userName);
        System.out.println("User Description: " + userDescription);
        System.out.println("Date: " + dueDate);

        scanner.close();
        fileScanner.close();
    }
}
