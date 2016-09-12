package blair.carina.Calculator;

/**
 * Created by carinablair on 9/11/16.
 */
public class BasicMath {
    Display basicDisplay = new Display();
    double basicState = basicDisplay.getState();
    public double add(double number){
        basicState += number;
        return basicState;
    }
    public double subtract(double number){
        basicState -= number;
        return basicState;
    }
    public double multiply(double number){
        basicState*=number;
        return basicState;
    }
    public double divide(double number){
        basicState/=number;
        return basicState;
    }
    public double square(double number){
        basicState = Math.pow(number,2);
        return basicState;
    }
    public double squareRoot(double number){
        basicState = Math.sqrt(number);
        return basicState;
    }
    public double variableExp(double number){
        basicState = Math.pow(basicState, number);
        return basicState;
    }
    public double changeSign(double number){
        basicState *= -1;
        return basicState;
    }

}
