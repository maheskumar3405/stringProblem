import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by MahiMac on 7/10/15.
 */
public class testStringProblem {

    @Test
    public void normalInputAPI(){

        stringProblem obj = new stringProblem();

        String word="California";
        char character= 'a';

        String expectedOutput = "cliforni";
        String actualOutput;

        actualOutput= obj.oneLineStrip(word,character);
        Assert.assertEquals(actualOutput,expectedOutput);

        actualOutput= obj.discreteStrip(word, character);
        Assert.assertEquals(actualOutput,expectedOutput);
    }


    @Test
    public void whitespaceDiscreteAPI(){

        stringProblem obj = new stringProblem();

        String word="California";
        char character= ' ';

        String expectedOutput = "california";
        String actualOutput;

        actualOutput= obj.oneLineStrip(word, character);
        Assert.assertEquals(actualOutput,expectedOutput);

        actualOutput= obj.discreteStrip(word, character);
        Assert.assertEquals(actualOutput,expectedOutput);

    }

    @Test
    public void lettertestAPI(){

        stringProblem obj = new stringProblem();

        String word="California";
        char character= 2;

        String expectedOutput = "california";
        String actualOutput;

        actualOutput= obj.oneLineStrip(word, character);
        Assert.assertEquals(actualOutput,expectedOutput);

        actualOutput= obj.discreteStrip(word, character);
        Assert.assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void nonexistenttestAPI(){

        stringProblem obj = new stringProblem();

        String word="California";
        char character= 'z';

        String expectedOutput = "california";
        String actualOutput;

        actualOutput= obj.oneLineStrip(word, character);
        Assert.assertEquals(actualOutput,expectedOutput);

        actualOutput= obj.discreteStrip(word, character);
        Assert.assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void specialchartestAPI(){

        stringProblem obj = new stringProblem();

        String word="C$@lifornia$";
        char character= '$';

        String expectedOutput = "c@lifornia";
        String actualOutput;

        actualOutput= obj.oneLineStrip(word, character);
        Assert.assertEquals(actualOutput,expectedOutput);

        actualOutput= obj.discreteStrip(word, character);
        Assert.assertEquals(actualOutput,expectedOutput);
    }



}
