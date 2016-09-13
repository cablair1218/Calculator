package blair.carina.Calculator;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by carinablair on 9/12/16.
 */
public class Modes {

    //Change modes between binary, decimal, hexidecimal, octal
    private NumberModes mode = NumberModes.DECIMAL;
    public enum NumberModes{
        BINARY, DECIMAL, HEXADECIMAL, OCTAL
    }
    public NumberModes getNumberMode(){
        return this.mode;
    }
    public void numericMode(String mode){
        String capMode = mode.toUpperCase();
        NumberModes modeChoice = NumberModes.valueOf(capMode);
        switch(modeChoice){
            case BINARY:
                this.mode = NumberModes.BINARY;
                break;
            case DECIMAL:
                this.mode = NumberModes.DECIMAL;
                break;
            case HEXADECIMAL:
                this.mode = NumberModes.HEXADECIMAL;
                break;
            case OCTAL:
                this.mode = NumberModes.OCTAL;
                break;
            default:

        }

    }
    public String convertMode(double currentState){
        String convertState = "";
        switch(this.mode){
            case BINARY:
                convertState += Integer.toBinaryString((int) currentState);
                break;
            case DECIMAL:
                convertState += Double.toString(currentState);
                break;
            case HEXADECIMAL:
                convertState += Double.toHexString(currentState);
                break;
            case OCTAL:
                convertState += Integer.toOctalString((int) currentState);
                break;
        }
        return convertState;
    }
    //change trig units between decimal and radians
    private TrigUnits trigUnits = TrigUnits.RADIANS;
    public enum TrigUnits{
        DEGREE, RADIANS
    }
    public TrigUnits getTrigUnits(){
        return this.trigUnits;
    }
    public void changeTrigUnits(String unit){
        if(unit.equalsIgnoreCase("degree")){
            this.trigUnits = TrigUnits.DEGREE;
        }
        else{
            this.trigUnits = TrigUnits.RADIANS;
        }
    }
    public double switchTrigUnits(double currentState){
        if(trigUnits.equals(TrigUnits.DEGREE)){
            currentState = Math.toDegrees(currentState);
        }
        else{
            currentState = Math.toRadians(currentState);
        }
        return currentState;
    }

}
