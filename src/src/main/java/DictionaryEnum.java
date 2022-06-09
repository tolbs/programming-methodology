public enum DictionaryEnum {

    ARROW(
            "Arrow",
            new String[]{
                    "noun"
            },
            new String[]{
                    "Here is one arrow: <IMG> -=>> </IMG>"
            }
    ),
    DISTINCT(
            "Distinct",
            new String[]{
                    "adjective",
                    "adjective",
                    "adverb",
                    "noun",
                    "noun",
                    "noun",
                    "noun",
                    "noun"
            },
            new String[]{
                    "Familiar. Worked in Java.",
                    "Unique. No duplicates. Clearly different or of a different kind.",
                    "Uniquely. Written \"distinctly\".",
                    "A keyword in this assignment.",
                    "A keyword in this assignment.",
                    "A keyword in this assignment.",
                    "An advanced search option.",
                    "Distinct is a parameter in this assignment."
            }
    ),
    PLACEHOLDER(
            "Placeholder",
            new String[]{
                    "adjective",
                    "adjective",
                    "adverb",
                    "conjunction",
                    "interjection",
                    "noun",
                    "noun",
                    "noun",
                    "preposition",
                    "pronoun",
                    "verb"
            },
            new String[]{
                    "To be updated...",
                    "To be updated...",
                    "To be updated...",
                    "To be updated...",
                    "To be updated...",
                    "To be updated...",
                    "To be updated...",
                    "To be updated...",
                    "To be updated...",
                    "To be updated...",
                    "To be updated..."
            }
    );

    private String word;
    private String[] part_of_speech;
    private String[] definition;

    DictionaryEnum(String word, String[] part_of_speech, String[] definition) {
        this.word = word;
        this.part_of_speech = part_of_speech;
        this.definition = definition;
    }
}