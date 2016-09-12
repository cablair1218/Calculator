package blair.carina.Calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by carinablair on 9/12/16.
 */
public class MemoryTest {
    Memory memory;

    @Before
    public void initializeM(){ memory = new Memory();}


    //Tests both getMemory and setMemory at the same time
    @Test
    public void setMemory(){
        memory.setMemory(4);
        Assert.assertEquals(4,memory.getMemory(),0);
    }
    @Test
    public void clearMemory(){
        memory.setMemory(4);
        Assert.assertEquals(4,memory.getMemory(),0);
        memory.clearMemory();
        Assert.assertEquals(0,memory.getMemory(),0);
    }
}
