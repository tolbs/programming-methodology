import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int queryCount = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== DICTIONARY 340 JAVA =====");
        System.out.print("Search [" + queryCount + "]: ");
        String user_input = scanner.nextLine();
        String[] tokens = user_input.toUpperCase().trim().split("\s+");

        while (!tokens[0].equals("!QUIT")) {
            queryCount++;
            Query query = InputParser.parse(tokens);
            System.out.println("Keyword: " + query.getWord());
            System.out.println("Part of speech: " + query.getPartOfSpeech());

            if (query.getIsDistinct()) {
                System.out.println("Unique entries only!");
            }
            if (query.getIsReversed()) {
                System.out.println("Starting from the back!");
            }
            System.out.print("Search [" + queryCount + "]: ");
            user_input = scanner.nextLine();
            tokens = user_input.toUpperCase().trim().split("\s+");
        }
    }
}