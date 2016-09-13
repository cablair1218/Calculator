package blair.carina.Calculator;
import java.lang.*;
/**
 * Created by carinablair on 9/11/16.
 */
public class BasicMath {

    public double add(double basicState, double number){
        basicState += number;
        return basicState;
    }
    public double subtract(double basicState, double number){
        basicState -= number;
        return basicState;
    }
    public double multiply(double basicState, double number){
        basicState *= number;
        return basicState;
    }
    public double divide(double basicState, double number){
        basicState /= number;
        return basicState;
    }
    public double square(double basicState){
        basicState = Math.pow(basicState,2);
        return basicState;
    }
    public double squareRoot(double basicState){
        basicState = Math.sqrt(basicState);
        return basicState;
    }
    public double variableExp(double basicState, double number){
        basicState = Math.pow(basicState, number);
        return basicState;
    }
    public double changeSign(double basicState){
        basicState *= -1;
        return basicState;
    }
}
