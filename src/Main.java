import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "Is learning fun?";
        String choiceOne = "No";
        String choiceTwo = "Yes";
        String choiceThree = "Meh";

        String correctAnswer = choiceTwo.toLowerCase();

        // Write a print statement asking the question
        // Write a print statement giving the answer choices
        System.out.println(question);
        System.out.println("Your Choices");
        System.out.println("\t" + choiceOne);
        System.out.println("\t" + choiceTwo);
        System.out.println("\t" + choiceThree);

        // Have the user input an answer
        // Retrieve the user's input
        System.out.println("Choose which number");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        if (correctAnswer.equals(input.toLowerCase())){
            System.out.println("Congrats you are correct");
        } else {
        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
            System.out.println("The answer we were looking for was " + correctAnswer);
        }
    }

}
