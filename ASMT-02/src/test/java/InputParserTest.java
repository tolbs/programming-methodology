import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class InputParserTest {

    @Test
    public void BasicKeywordParse1() {
        String input = "  wOrd   ";
        String[] tokens = input.trim().split("\s+");
        Query query = InputParser.parse(tokens);
        Assert.assertEquals("WORD", query.getWord());
    }

    @Test
    public void BasicKeywordParse2() {
        String input = "  wORd    WorD2 word34     word664";
        String[] tokens = input.trim().split("\s+");
        Query query = InputParser.parse(tokens);
        Assert.assertEquals("WORD", query.getWord());
    }

    @Test
    public void DistinctFlagTest1() {
        String input = "    distinct distinct   ";
        String[] tokens = input.trim().split("\s+");
        Query query = InputParser.parse(tokens);
        Assert.assertTrue(query.getIsDistinct());
    }

    @Test
    public void DistinctFlagTest2() {
        String input = "word noun distinct";
        String[] tokens = input.trim().split("\s+");
        Query query = InputParser.parse(tokens);
        Assert.assertTrue(query.getIsDistinct());
    }

    @Test
    public void DistinctFlagTest3() {
        String input = "word noun reverse distinct";
        String[] tokens = input.trim().split("\s+");
        Query query = InputParser.parse(tokens);
        Assert.assertTrue(query.getIsDistinct());
    }

    @Test
    public void ValidNounTest1() {
        String input = "   reverse ok  distinct";
        Set<String> part_of_speech = new HashSet<>();
        part_of_speech.add("adjective");
        part_of_speech.add("adverb");
        part_of_speech.add("conjunction");
        part_of_speech.add("interjection");
        part_of_speech.add("noun");
        part_of_speech.add("preposition");
        part_of_speech.add("pronoun");
        part_of_speech.add("verb");

        String[] tokens = input.trim().split("\s+");
        Query query = InputParser.parse(tokens);
        Assert.assertFalse(part_of_speech.contains(query.getPartOfSpeech()));
    }

    @Test
    public void ValidNounTest2() {
        String input = "   reverse verb  distinct";
        Set<String> part_of_speech = new HashSet<>();
        part_of_speech.add("adjective");
        part_of_speech.add("adverb");
        part_of_speech.add("conjunction");
        part_of_speech.add("interjection");
        part_of_speech.add("noun");
        part_of_speech.add("preposition");
        part_of_speech.add("pronoun");
        part_of_speech.add("verb");

        String[] tokens = input.trim().split("\s+");
        Query query = InputParser.parse(tokens);
        Assert.assertTrue(part_of_speech.contains(query.getPartOfSpeech().toLowerCase()));
    }



}