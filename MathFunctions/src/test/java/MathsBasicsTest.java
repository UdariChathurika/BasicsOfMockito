import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MathsBasicsTest {

    MathsBasics mathsBasicsObj;//The object that need to  mocked



    @Before
    //Create mock Object before use them
    public void create(){
        mathsBasicsObj = mock(MathsBasics.class);
    }

    @Test
    public void additionShouldReturnInt(){
        when(mathsBasicsObj.add(1,2)).thenReturn(3);
        mathsBasicsObj.add(1,2);
        //assertSame(3,mathsBasicsObj.add(1,2));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionFromZeroShouldReturnExp() {
        when(mathsBasicsObj.div(anyInt(),eq(0))).thenThrow(new ArithmeticException());
        mathsBasicsObj.div(4,0);

    }

    @Test
    public void multiplicationOfZeroShouldReturnZero() {
        when(mathsBasicsObj.mul(anyInt(),eq(0))).thenReturn(0);
        mathsBasicsObj.mul(1,0);

    }

}
