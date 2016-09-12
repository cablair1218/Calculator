package blair.carina.Calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by carinablair on 9/12/16.
 */
public class ScientificMathTest {
    ScientificMath scientificMath;

    @Before
    public void initializeSM(){ scientificMath = new ScientificMath();}

    ///Trig Function Tests
    @Test
    public void sine(){
        Assert.assertEquals(0,scientificMath.sine(0), 0);
    }
    @Test
    public void cosine(){
        Assert.assertEquals(1,scientificMath.cosine(0), 0);
    }
    @Test
    public void tangent(){
        Assert.assertEquals(0,scientificMath.tangent(0), 0);
    }
    @Test
    public void inverseSine(){
        Assert.assertEquals(0,scientificMath.inverseSine(0), 0);
    }
    @Test
    public void inverseCosine(){
        Assert.assertEquals(0,scientificMath.inverseCosine(1), 0);
    }
    @Test
    public void inverseTangent(){
        Assert.assertEquals(0,scientificMath.inverseTangent(0), 0);
    }

    //Log Function tests

    @Test
    public void naturalLog(){
        Assert.assertEquals(1,scientificMath.naturalLog(Math.E), 0);
    }
    @Test
    public void log(){
        Assert.assertEquals(1,scientificMath.log(10), 0);
    }
    @Test
    public void inverseLog(){
        Assert.assertEquals(10,scientificMath.inverseLog(1), 0);
    }
    @Test
    public void inverseLn(){
        Assert.assertEquals(Math.E,scientificMath.inverseLn(1), 0);
    }

    ///Factorial
    @Test
    public void factorial(){
        Assert.assertEquals(720,scientificMath.factorial(6), 0);
    }


}

