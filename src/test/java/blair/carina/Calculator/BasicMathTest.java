package blair.carina.Calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by carinablair on 9/12/16.
 */
public class BasicMathTest {
    BasicMath basicMath;

    @Before
    public void initializeBM(){ basicMath = new BasicMath();}

    @Test
    public void add(){
        Assert.assertEquals(4,basicMath.add(4,0), 0);
    }
    @Test
    public void subtract(){
        Assert.assertEquals(4,basicMath.subtract(4,0), 0);
    }
    @Test
    public void multiply(){
        Assert.assertEquals(0,basicMath.multiply(4,0), 0);
    }
    @Test
    public void divide(){
        Assert.assertEquals(4,basicMath.divide(4,1), 0);
    }
    @Test
    public void square(){
        Assert.assertEquals(16,basicMath.square(4), 0);
    }
    @Test
    public void squareRoot(){
        Assert.assertEquals(2,basicMath.squareRoot(4), 0);
    }
    @Test
    public void variableExp(){
        Assert.assertEquals(4,basicMath.variableExp(4,1), 0);
    }
    @Test
    public void changeSign(){
        Assert.assertEquals(-4,basicMath.changeSign(4), 0);
    }

}
