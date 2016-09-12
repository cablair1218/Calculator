package blair.carina.Calculator;

/**
 * Created by carinablair on 9/12/16.
 */
public class ScientificMath {
    Display scienceDisplay = new Display();
    double scienceState = scienceDisplay.getState();
    public double sine(){
        scienceState = Math.sin(scienceState);
        return scienceState;
    }
    public double cosine(){
        scienceState = Math.cos(scienceState);
        return scienceState;
    }
    public double tangent(){
        scienceState = Math.tan(scienceState);
        return scienceState;
    }
    public double inverseSine(){
        scienceState = Math.asin(scienceState);
        return scienceState;
    }
    public double inverseCosine(){
        scienceState = Math.acos(scienceState);
        return scienceState;
    }
    public double inverseTangent(){
        scienceState = Math.atan(scienceState);
        return scienceState;
    }
    public


}
