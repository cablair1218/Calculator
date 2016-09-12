package blair.carina.Calculator;

import java.util.Scanner;

/**
 * Created by carinablair on 9/11/16.
 */
public class Display {
    private Memory memory = new Memory();
    private BasicMath basicMath = new BasicMath();
    private ScientificMath scientificMath = new ScientificMath();
    private double state;
    public Display(){
        this.state = 0.0; //default state of Calculator
    }
    public Scanner userInput = new Scanner(System.in);
    //Input options. Diff variables for different menus. Help distinguish between menus
    private int option;
    private int basicOption;
    private int scienceOption;
    private int trigOption;
    private int logOPtion;
    private int trigUnitOption;
    private int modeOption;
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
                this.changeModeDisplay();
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
        System.out.printf("Please select an option:%n1.Add%n2.Subtraction%n3.Multiplication%n4.Division" +
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
        double currentState = this.state;
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
        double currentState = this.state;
        switch(trigOption){
            case 1:
                System.out.println("Choose number:");
                currentState = userInput.nextDouble();
                System.out.printf("sin( %.2f ) = %.2f%n", state,scientificMath.sine(currentState));
                this.state = scientificMath.sine(currentState);
                break;
            case 2:
                System.out.println("Choose number:");
                currentState = userInput.nextDouble();
                System.out.printf("cos( %.2f ) = %.2f%n", state,scientificMath.cosine(currentState));
                this.state = scientificMath.cosine(currentState);
                break;
            case 3:
                System.out.println("Choose number:");
                currentState = userInput.nextDouble();
                System.out.printf("tan( %.2f ) = %.2f%n", state, scientificMath.tangent(currentState));
                this.state = scientificMath.tangent(currentState);
                break;
            case 4:
                System.out.println("Choose number:");
                currentState = userInput.nextDouble();
                System.out.printf("asin( %.2f ) = %.2f%n", state,scientificMath.inverseSine(currentState));
                this.state = scientificMath.inverseSine(currentState);
                break;
            case 5:
                System.out.println("Choose number:");
                currentState = userInput.nextDouble();
                System.out.printf("acos( %.2f ) = %.2f%n", state, scientificMath.inverseCosine(currentState));
                this.state = scientificMath.inverseCosine(currentState);
                break;
            case 6:
                System.out.println("Choose number:");
                currentState = userInput.nextDouble();
                System.out.printf("atan( %.2f ) = %.2f%n", state, scientificMath.inverseTangent(currentState));
                this.state = scientificMath.inverseTangent(currentState);
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
        System.out.printf("Please select an option:%n1.Degree%n2.Radians%n" +
                "%n3.Back%n");
        trigUnitOption = userInput.nextInt();

    }
    //Trig Units option choices. Run this so that it can print and access switch for user input
    public void trigUnits(){
        this.trigUnitsOption();
        System.out.println("Choose number:");
        switch (trigUnitOption){
            case 1:
               // scientificMath.toRadians();
                System.out.println("Trig Units are now in Radians");
                break;
            case 2:
                //scientificMath.toDegrees();
                System.out.println("Trig Units are now in Degrees");
                break;
            case 3:
                this.trigOptions();
                break;
            default:
                System.out.println("That was not one of the options. Please try again.");
                this.trigUnits();
        }

    }
    //Log options menu
    public void logOptions(){
        this.currentDisplay();
        System.out.println("_______________________________\n");
        System.out.printf("Please select an option:%n1.Log Base 10%n2.Natural Log%n3.Inverse Log" +
                "%n4.Inverse Natural Log%n5.Back%n");
        logOPtion = userInput.nextInt();
    }
    //Log option choices. Run this so that it can print and access switch for user input
    public void logChoice(){
        this.logOptions();
        double currentState = this.state;
        switch(logOPtion){
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
        System.out.println(state);
    }
    public void exitProgram(){
        bool = false;
        this.state = 0.0;
        System.exit(0);
    }



}
