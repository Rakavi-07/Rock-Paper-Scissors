import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to Rock-Paper-Scissors! 🎮");
        System.out.println("1 = Rock ✊, 2 = Paper 🖐️, 3 = Scissors ✌️");

        System.out.print("Enter your choice (1-3): ");
        int userChoice = sc.nextInt();

        int compChoice = rand.nextInt(3) + 1; // 1 to 3

        System.out.print("You chose: ");
        printChoice(userChoice);

        System.out.print("Computer chose: ");
        printChoice(compChoice);

        if (userChoice == compChoice) {
            System.out.println("It's a draw! 🤝");
        } else if ((userChoice == 1 && compChoice == 3) ||
                   (userChoice == 2 && compChoice == 1) ||
                   (userChoice == 3 && compChoice == 2)) {
            System.out.println("You win! 🎉");
        } else {
            System.out.println("Computer wins! 🤖");
        }

        sc.close();
    }

    static void printChoice(int choice) {
        switch (choice) {
            case 1 -> System.out.println("Rock ✊");
            case 2 -> System.out.println("Paper 🖐️");
            case 3 -> System.out.println("Scissors ✌️");
            default -> System.out.println("Invalid choice");
        }
    }
}

