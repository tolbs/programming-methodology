import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class InputParserTest {

    @Test
    public void basicParse() {
        String input = "keyword";
        Query query = InputParser.parse(input);
        assertEquals("keyword", query.getWord());
    }

    @Test
    public void parseWithPartOfSpeech() {
        String input = "keyword part_of_speech";
        Query query = InputParser.parse(input);
        assertEquals("keyword", query.getWord());
        assertEquals("part_of_speech", query.getPartOfSpeech());
    }

    @Test
    public void parseWithDistinct() {
        String input = "keyword distinct";
        Query query = InputParser.parse(input);
        assertEquals("keyword", query.getWord());
        assertTrue(query.getIsDistinct());
    }

    @Test
    public void parseWithReversed() {
        String input = "keyword reverse";
        Query query = InputParser.parse(input);
        assertEquals("keyword", query.getWord());
        assertTrue(query.getIsReversed());
    }

}