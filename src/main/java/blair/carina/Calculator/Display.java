package blair.carina.Calculator;

import java.util.Scanner;
import java.lang.*;

/**
 * Created by carinablair on 9/11/16.
 */
public class Display {

    //Instances of all classes needed to run calculator options
    private Memory memory = new Memory();
    private BasicMath basicMath = new BasicMath();
    private ScientificMath scientificMath = new ScientificMath();
    private Modes modes = new Modes();

    //State to determine the display and current state of calculator
    private double state;

    //Sets default state for calculator
    public Display(){
        this.state = 0.0; //default state of Calculator
    }

    public Scanner userInput = new Scanner(System.in);

    //Input options. Diff variables for different menus. Help distinguish between menus

    private int option;
    private int basicOption;
    private int scienceOption;
    private int trigOption;
    private int logOption;
    private String trigUnitOption;
    private String modeOption;
    private int memoryOption;
    boolean bool = true;

    //Initial Calc Greeting
    public void startCalculator(){
        System.out.println("Welcome to your Calculator.");
        this.optionDisplay();
        while(bool){
            this.optionDisplay();
        }
    }
    public void currentDisplay(){
        System.out.println("\n############################\n");
        System.out.println("Display:\t" + this.state);
        System.out.println("\n############################\n");
    }
    public void currentStringDisplay(String stringState){
        System.out.println("\n############################\n");
        System.out.println("Display:\t" + stringState);
        System.out.println("\n############################\n");
    }

    //Main menu print out
    public void optionChoice(){
        this.currentDisplay();
        System.out.println("_______________________________\n");
        System.out.printf("Please select an option:%n1.Basic Operations%n2.Scientific Operations" +
                "%n3.Change Modes%n4.Memory%n5.Current State%n6.Change State%n7.Clear Display%n8.Exit Calculator%n");
        option = userInput.nextInt();
    }
    //Main menu option choices. Run this so that it can print and access switch for user input
    public void optionDisplay(){
        this.optionChoice();
        switch(option) {
            case 1:
                this.basicCalculations();
                break;
            case 2:
                this.scientific();
                break;
            case 3:
                this.changeMode();
                break;
            case 4:
                this.memoryStore();
                break;
            case 5:
                System.out.println(this.state);
                break;
            case 6:
                System.out.println("Choose number:");
                state = userInput.nextDouble();
                this.basicCalculations();
                break;
            case 7:
                this.clearDisplay();
                break;
            case 8:
                this.exitProgram();
                break;
            default:
                System.out.println("You chose an option that was not on the list. Please try again");
                this.optionDisplay();
        }

    }
    //Basic Math options print
    public void basicOperations(){
        this.currentDisplay();
        System.out.println("_______________________________\n");
        System.out.printf("Please select an option:%n1.Add%n2.Subtraction%n3.Multiplication%n4.Division%n" +
                "5.Square%n6.Square Root%n7.Variable Exponent%n8.Change Sign%n9.Back%n");
        basicOption = userInput.nextInt();

    }
    //Basic Math option choices. Run this so that it can print and access switch for user input
    public void basicCalculations(){
        this.basicOperations();
        double number;
        double currentState = this.state;
        switch(basicOption) {
            case 1:
                System.out.println("Choose number:");
                number = userInput.nextDouble();
                System.out.printf("%.2f + %.2f  = %.2f%n", currentState, number, basicMath.add(currentState, number));
                this.state = basicMath.add(number, currentState);
                break;
            case 2:
                System.out.println("Choose number:");
                number = userInput.nextDouble();
                System.out.printf("%.2f - %.2f  = %.2f%n", currentState, number, basicMath.subtract(currentState, number));
                this.state = basicMath.subtract(number, currentState);
                break;
            case 3:
                System.out.println("Choose number:");
                number = userInput.nextDouble();
                System.out.printf("%.2f * %.2f  = %.2f%n", currentState, number, basicMath.multiply(currentState, number));
                this.state = basicMath.multiply(number, currentState);
                break;
            case 4:
                System.out.println("Choose number:");
                number = userInput.nextDouble();
                System.out.printf("%.2f / %.2f  = %.2f%n", currentState, number, basicMath.divide(currentState, number));
                this.state = basicMath.divide(number, currentState);
                break;
            case 5:
                System.out.println("Choose number:");
                number = userInput.nextDouble();
                System.out.printf("%.2f ^ 2  = %.2f", number, basicMath.square(number));
                this.state = basicMath.square(number);
                break;
            case 6:
                System.out.println("Choose number:");
                number = userInput.nextDouble();
                System.out.printf("sqrt( %.2f ) = %.2f%n", number, basicMath.squareRoot(number));
                this.state = basicMath.squareRoot(number);
                break;
            case 7:
                System.out.println("Choose number:");
                number = userInput.nextDouble();
                System.out.printf("%.2f ^ %.2f = %.2f%n", currentState, number, basicMath.variableExp(currentState, number));
                this.state = basicMath.variableExp(currentState, number);
                break;
            case 8:
                System.out.println("Choose number:");
                number = userInput.nextDouble();
                System.out.printf("%.2f%n", basicMath.changeSign(number));
                this.state = basicMath.changeSign(number);
                break;
            case 9:
                this.optionChoice();
                break;
            default:
                System.out.println("That option is not on this list. Please try again.");
                this.basicCalculations();
        }
    }
    //Scientific math options
    public void scientificOperations(){
        this.currentDisplay();
        System.out.println("_______________________________\n");
        System.out.printf("Please select an option:%n1.Trig Functions%n2.Change Trig Units%n3.Log Functions%n4.Factorial" +
                "%n5.Back%n");
        scienceOption = userInput.nextInt();

    }
    //Scientific Math option choices. Run this so that it can print and access switch for user input
    public void scientific(){
        this.scientificOperations();
        double currentState;
        switch(scienceOption){
            case 1:
                this.trigCalculations();
                break;
            case 2:
                this.trigUnits();
                break;
            case 3:
                this.logChoice();
                break;
            case 4:
                System.out.println("Choose number:");
                currentState = userInput.nextDouble();
                System.out.printf("%.2f! = %.2f", currentState, scientificMath.factorial(currentState));
                this.state = scientificMath.factorial(currentState);
                break;
            case 5:
                this.optionDisplay();
                break;
            default:
                System.out.println("That was not one of the options. Please try again.");
                this.scientificOperations();

        }
    }
    //Trig function options menu
    public void trigOptions(){
        this.currentDisplay();
        System.out.println("_______________________________\n");
        System.out.printf("Please select an option:%n1.Sine%n2.Cosine%n3.Tangent%n4.Inverse Sine%n5.Inverse Cosine" +
                "%n6.Inverse Tangent%n7.Back%n");
        trigOption = userInput.nextInt();
    }
    //Trig functions option choices. Run this so that it can print and access switch for user input
    public void trigCalculations(){
        this.trigOptions();
        double userChoice;
        switch(trigOption){
            case 1:
                System.out.println("Choose number:");
                userChoice = userInput.nextDouble();
                System.out.printf("sin( %.2f ) = %.2f%n", userChoice,scientificMath.sine(userChoice));
                this.state = scientificMath.sine( userChoice);
                break;
            case 2:
                System.out.println("Choose number:");
                userChoice = userInput.nextDouble();
                System.out.printf("cos( %.2f ) = %.2f%n",  userChoice,scientificMath.cosine( userChoice));
                this.state = scientificMath.cosine( userChoice);
                break;
            case 3:
                System.out.println("Choose number:");
                userChoice = userInput.nextDouble();
                System.out.printf("tan( %.2f ) = %.2f%n",  userChoice, scientificMath.tangent( userChoice));
                this.state = scientificMath.tangent( userChoice);
                break;
            case 4:
                System.out.println("Choose number:");
                userChoice = userInput.nextDouble();
                System.out.printf("asin( %.2f ) = %.2f%n",  userChoice,scientificMath.inverseSine( userChoice));
                this.state = scientificMath.inverseSine( userChoice);
                break;
            case 5:
                System.out.println("Choose number:");
                userChoice = userInput.nextDouble();
                System.out.printf("acos( %.2f ) = %.2f%n",  userChoice, scientificMath.inverseCosine( userChoice));
                this.state = scientificMath.inverseCosine( userChoice);
                break;
            case 6:
                System.out.println("Choose number:");
                userChoice = userInput.nextDouble();
                System.out.printf("atan( %.2f ) = %.2f%n",  userChoice, scientificMath.inverseTangent( userChoice));
                this.state = scientificMath.inverseTangent( userChoice);
                break;
            case 7:
                this.scientific();
                break;
            default:
                System.out.println("That was not one of the options. Please Try again.");
                this.trigCalculations();
        }

    }
    //Trig Units option menu
    public void trigUnitsOption(){
        this.currentDisplay();
        System.out.println("_______________________________\n");
        System.out.printf("Please select an option:%nDegree%nRadian%nCurrent%nBack%n");
        trigUnitOption = userInput.next();

    }
    //Trig Units option choices. Run this so that it can print and access switch for user input
    public void trigUnits(){
        this.trigUnitsOption();
        if(trigUnitOption.equalsIgnoreCase("current")){
            System.out.println("The current mode is " + modes.getTrigUnits());
        }
        else if(trigUnitOption.equalsIgnoreCase("back")) {
            this.optionDisplay();
        }
        else {
            modes.changeTrigUnits(trigUnitOption);
            System.out.println("Choose number:");
            double currentState = userInput.nextDouble();
            this.state = modes.switchTrigUnits(currentState);
            this.trigCurrentState();
        }

    }
    public void trigCurrentState(){
        this.trigOptions();
        switch(trigOption){
            case 1:
                System.out.printf("sin( %.2f ) = %.2f%n", state,scientificMath.sine(state));
                this.state = scientificMath.sine( state);
                break;
            case 2:
                System.out.printf("cos( %.2f ) = %.2f%n",  state,scientificMath.cosine( state));
                this.state = scientificMath.cosine( state);
                break;
            case 3:
                System.out.printf("tan( %.2f ) = %.2f%n",  state, scientificMath.tangent( state));
                this.state = scientificMath.tangent( state);
                break;
            case 4:
                System.out.printf("asin( %.2f ) = %.2f%n",  state,scientificMath.inverseSine( state));
                this.state = scientificMath.inverseSine( state);
                break;
            case 5:
                System.out.printf("acos( %.2f ) = %.2f%n",  state, scientificMath.inverseCosine( state));
                this.state = scientificMath.inverseCosine( state);
                break;
            case 6:
                System.out.printf("atan( %.2f ) = %.2f%n",  state, scientificMath.inverseTangent( state));
                this.state = scientificMath.inverseTangent(state);
                break;
            case 7:
                this.scientific();
                break;
            default:
                System.out.println("That was not one of the options. Please Try again.");
                this.trigCalculations();
        }
    }

    //Log options menu
    public void logOptions(){
        this.currentDisplay();
        System.out.println("_______________________________\n");
        System.out.printf("Please select an option:%n1.Log Base 10%n2.Natural Log%n3.Inverse Log" +
                "%n4.Inverse Natural Log%n5.Back%n");
        logOption = userInput.nextInt();
    }

    //Log option choices. Run this so that it can print and access switch for user input
    public void logChoice(){
        this.logOptions();
        double currentState;
        switch(logOption){
            case 1:
                System.out.println("Choose number:");
                currentState = userInput.nextDouble();
                System.out.printf("log( %.2f ) = %.2f%n", currentState, scientificMath.log(currentState));
                this.state = scientificMath.inverseTangent(currentState);
                break;
            case 2:
                System.out.println("Choose number:");
                currentState = userInput.nextDouble();
                System.out.printf("ln( %.2f ) = %.2f%n", currentState, scientificMath.naturalLog(currentState));
                this.state = scientificMath.inverseTangent(currentState);
                break;
            case 3:
                System.out.println("Choose number:");
                currentState = userInput.nextDouble();
                System.out.printf("10 ^ %.2f = %.2f%n", currentState, scientificMath.inverseLog(currentState));
                this.state = scientificMath.inverseTangent(currentState);
                break;
            case 4:
                System.out.println("Choose number:");
                currentState = userInput.nextDouble();
                System.out.printf("e ^ %.2f = %.2f%n", currentState, scientificMath.inverseLn(currentState));
                this.state = scientificMath.inverseTangent(currentState);
                break;
            case 5:
                this.scientificOperations();
                break;
            default:
                System.out.println("That was not one of the options. Please try again.");
                this.logChoice();
        }
    }

    public void changeModeDisplay(){
        System.out.println("_______________________________\n");
        System.out.printf("Please select an option:%nBinary%nDecimal%nHexadecimal%nOctal%nCurrent%nBack");
        modeOption = userInput.next();
    }

    public void changeMode(){
        this.changeModeDisplay();
        if(modeOption.equals("")){
            modes.numericMode();
            modes.convertMode(this.state);



        }
        else {
            if (modeOption.equalsIgnoreCase("current")) {
                System.out.println("The current mode is " + modes.getNumberMode());
            } else if (modeOption.equalsIgnoreCase("back")) {
                this.optionDisplay();
            } else {
                modes.numericMode(modeOption);
                System.out.println("Choose number:");
                this.state = userInput.nextDouble();
                String stringState = modes.convertMode(state);
                this.currentStringDisplay(stringState);
                this.clearDisplay();
                this.optionDisplay();
            }
        }
    }

    public void memoryMenu(){
        this.currentDisplay();
        System.out.println("_______________________________\n");
        System.out.printf("Please select an option:%n1.Store Number%n2Display Memory" +
                "%n3.Clear Memory%n4.Back%n");
        memoryOption = userInput.nextInt();
    }

    public void memoryStore(){
        this.memoryMenu();
        switch(memoryOption){
            case 1:
                System.out.println("Choose number:");
                state = userInput.nextDouble();
                memory.setMemory(state);
                System.out.printf("%.2f is now stored in Memory", memory.getMemory());
                break;
            case 2:
                System.out.printf("%.2f is now stored in Memory", memory.getMemory());
                break;
            case 3:
                memory.clearMemory();
                System.out.println("Memory has been cleared");
                break;
            case 4:
                this.basicCalculations();
                break;
            default:
                System.out.println("That was not one of the options. Please try again.");
                this.memoryStore();
        }
    }

    public void clearDisplay(){
        this.state = 0.0;
    }

    public void exitProgram(){
        bool = false;
        this.state = 0.0;
        System.exit(0);
    }



}
