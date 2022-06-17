import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InputValidator {
    public static boolean isPartOfSpeech(String input) {
        Set<String> part_of_speech = new HashSet<>(Arrays.asList("ADJECTIVE", "ADVERB", "CONJUNCTION", "INTERJECTION", "NOUN", "PREPOSITION", "PRONOUN", "VERB"));
        return part_of_speech.contains(input);
    }

    public static boolean isDistinct(String input) {
        return input.equals("DISTINCT");
    }

    public static boolean isReverse(String input) {
        return input.equals("REVERSE");
    }

    public static boolean isValid(String input) {
        boolean isPartOfSpeech, isDistinct, isReverse;
        String[] tokens = input.trim().split("\s+");
        if (tokens.length == 1 && tokens[0].length() > 0) {
            return true;
        }
        for (int i = 1; i < tokens.length; i++) {
            String token = tokens[i];
            isPartOfSpeech = isPartOfSpeech(token);
            isDistinct = isDistinct(token);
            isReverse = isReverse(token);

            switch (i) {
                case 1 -> {
                    if (!isPartOfSpeech && !isDistinct && !isReverse) {
                        System.out.println("The 2nd parameter should be either a part of speech or 'DISTINCT' or 'REVERSE'");
                        return false;
                    } else if (!isPartOfSpeech) {
                        System.out.println("The entered " + i+1 + " parameter is not a part of speech");
                    } else if (!isDistinct) {
                        System.out.println("The entered " + i+1 + " parameter '" + token + "' is not 'DISTINCT'.");
                    } else if (!isReverse) {
                        System.out.println("The entered " + i+1 + " parameter '" + token + "' is not 'REVERSE'.");
                    } else {
                        return false;
                    }
                }
                case 2 -> {
                    if (!isDistinct) {
                        System.out.println("The entered " + i+1 + " parameter '" + token + "' is not 'DISTINCT'");
                    }
                    if (!isReverse) {
                        System.out.println("The entered " + i+1 + " parameter '" + token + "' is not 'REVERSE'");
                    }
                }
                case 3 -> {
                    if (!isReverse) {
                        System.out.println("The entered " + i+1 + " parameter '" + token + "' is not 'REVERSE'");
                    }
                }
            }
        }
        return true;
    }
}