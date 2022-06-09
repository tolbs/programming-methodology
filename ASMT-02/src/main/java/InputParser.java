public class InputParser {

    public static Query parse(String input) {

        //@TODO: account for leading white space
        String[] tokens = input.toUpperCase().split(" ");
        Query.QueryBuilder builder = new Query.QueryBuilder(tokens[0]);
        for (int i = 1; i < tokens.length; i++) {
            String token = tokens[i];
            if (token.equals("DISTINCT")) {
                builder.setIsDistinct(true);
            } else if (token.equals("REVERSE")) {
                builder.setIsReversed(true);
            } else {
                //@TODO: ensure only valid part of speech is set
                builder.setPartOfSpeech(token);
            }
        }
        return builder.build();
    }
}