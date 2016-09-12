package blair.carina.Calculator;

/**
 * Created by carinablair on 9/11/16.
 */
public class Memory {
    private double memory;
    public Memory(){
        this.memory = 0.0;
    }
    public void setMemory(double memState){
        this.memory = memState;
    }
    public double getMemory(){
        return this.memory;
    }
    public void clearMemory(){
        this.memory = 0.0;
    }
}
