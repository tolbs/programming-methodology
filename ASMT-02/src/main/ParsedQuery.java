package main;

public class ParsedQuery {
    private String word;
    private String part_of_speech;
    boolean is_distinct;
    boolean is_reversed;

    public void setWord(String word){
        this.word = word;
    }

    public String getWord(){
        return word;
    }

    public void setPartOfSpeech(String part_of_speech){
        this.part_of_speech = part_of_speech;
    }

    public String getPartOfSpeech(){
        return part_of_speech;
    }

    public void setIsDistinct(boolean is_distinct){
        this.is_distinct = is_distinct;
    }

    public boolean getIsDistinct(){
        return is_distinct;
    }

    public void setIsReversed(boolean is_reversed){
        this.is_reversed = is_reversed;
    }

    public boolean getIsReversed(){
        return is_reversed;
    }
}
