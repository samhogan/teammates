package teammates.test.cases;

import static org.junit.Assert.*;
import org.junit.Test;
import teammates.common.util.StringHelper;

public class SampleTest {


    @Test
    public void givenLongString_whenTruncate_thenReturnTruncatedWithEllipsis()
    {
        String longString = "This is a very long string that needs to be truncated";
        String truncatedString = StringHelper.truncate(longString, 10);
        assertEquals(truncatedString, "This is..."); //uses .equals() internally
    }
}
