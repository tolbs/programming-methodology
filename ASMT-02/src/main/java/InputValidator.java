public class InputValidator {

    public static boolean IsValid(String input) {
        String[] tokens = input.trim().split("\s+");
        if (!tokens[1].equals("DISTINCT") || !tokens[1].equals("REVERSE")) {
            return true;
        }
        return false;
    }
}
