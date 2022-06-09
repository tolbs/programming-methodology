import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //read user input and tokenize it

        Scanner scanner = new Scanner(System.in);
        String user_input = scanner.nextLine();

        //@TODO: make loop end when user types "quit"

        while (!user_input.equals("quit")) {
            //parse user input
            Query query = InputParser.parse(user_input);
            System.out.println(query.getWord());
            if (query.getIsDistinct()) {
                System.out.println("Unique entries only!");
            }
            if (query.getIsReversed()) {
                System.out.println("Starting from the back!");
            }
        }
    }
}