import org.junit.Assert;
import org.junit.Test;

public class InputParserTest {

    @Test
    public void BasicKeywordParse1() {
        String input = "word   ";
        Query query = InputParser.parse(input);
        Assert.assertEquals("WORD", query.getWord());
    }

    @Test
    public void BasicKeywordParse2() {
        String input = "wORd   ";
        Query query = InputParser.parse(input);
        Assert.assertEquals("WORD", query.getWord());
    }

    @Test
    public void DistinctFlagTest1() {
        String input = "distinct distinct";
        Query query = InputParser.parse(input);
        Assert.assertTrue(query.getIsDistinct());
    }

    @Test
    public void DistinctFlagTest2() {
        String input = "word noun distinct";
        Query query = InputParser.parse(input);
        Assert.assertTrue(query.getIsDistinct());
    }

    @Test
    public void DistinctFlagTest3() {
        String input = "word noun reverse distinct";
        Query query = InputParser.parse(input);
        Assert.assertTrue(query.getIsDistinct());
    }

    @Test
    public void ValidNounTest1() {

    }



}