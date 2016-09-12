package blair.carina.Calculator;

/**
 * Created by carinablair on 9/12/16.
 */
public class ScientificMath {

    ////Trig FUnctions

    public double sine(double scienceState){
        scienceState = Math.sin(scienceState);
        return scienceState;
    }
    public double cosine(double scienceState){
        scienceState = Math.cos(scienceState);
        return scienceState;
    }
    public double tangent(double scienceState){
        scienceState = Math.tan(scienceState);
        return scienceState;
    }
    public double inverseSine(double scienceState){
        scienceState = Math.asin(scienceState);
        return scienceState;
    }
    public double inverseCosine(double scienceState){
        scienceState = Math.acos(scienceState);
        return scienceState;
    }
    public double inverseTangent(double scienceState){
        scienceState = Math.atan(scienceState);
        return scienceState;
    }

    ///Log Functions

    public double naturalLog(double scienceState){
        scienceState = Math.log(scienceState);
        return scienceState;
    }
    public double log(double scienceState){
        scienceState = Math.log10(scienceState);
        return scienceState;
    }
    public double inverseLog(double scienceState){
        scienceState = Math.pow(10, scienceState);
        return scienceState;
    }
    public double inverseLn(double scienceState){
        scienceState = Math.pow(Math.E, scienceState);
        return scienceState;
    }

    ///Factorial

    public double factorial(double scienceState){
        double startPoint = 1;
        for(int i = 1; i <= scienceState; i++){
            startPoint*=i;
        }
        scienceState = startPoint;
        return scienceState;
    }


}
