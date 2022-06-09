public class Query {
    //required parameters
    private final String word;

    //optional parameters
    private final String part_of_speech;
    private final boolean is_distinct;
    private final boolean is_reversed;


    public String getWord(){
        return word;
    }

    public String getPartOfSpeech(){
        return part_of_speech;
    }

    public boolean getIsDistinct(){
        return is_distinct;
    }

    public boolean getIsReversed(){
        return is_reversed;
    }

    private Query(QueryBuilder builder) {
        this.word = builder.word;
        this.part_of_speech = builder.part_of_speech;
        this.is_distinct = builder.is_distinct;
        this.is_reversed = builder.is_reversed;
    }

    public static class QueryBuilder {
        //required parameters
        private final String word;

        //optional parameters
        private String part_of_speech;
        private boolean is_distinct;
        private boolean is_reversed;

        public QueryBuilder(String word) {
            this.word = word;
        }

        public QueryBuilder setPartOfSpeech(String part_of_speech) {
            this.part_of_speech = part_of_speech;
            return this;
        }

        public QueryBuilder setIsDistinct(boolean is_distinct) {
            this.is_distinct = is_distinct;
            return this;
        }

        public QueryBuilder setIsReversed(boolean is_reversed) {
            this.is_reversed = is_reversed;
            return this;
        }

        public Query build() {
            return new Query(this);
        }
    }
}