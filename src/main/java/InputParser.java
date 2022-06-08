package main;

public class InputParser {

    public static Query parse(String input) {
        String[] tokens = input.split(" ");
        Query.QueryBuilder builder = new Query.QueryBuilder(tokens[0]);
        for (int i = 1; i < tokens.length; i++) {
            String token = tokens[i];
            if (token.equals("distinct")) {
                builder.setIsDistinct(true);
            } else if (token.equals("reverse")) {
                builder.setIsReversed(true);
            } else {
                builder.setPartOfSpeech(token);
            }
        }
        return builder.build();
    }
}