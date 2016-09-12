package blair.carina.Calculator;

import java.util.Scanner;

/**
 * Created by carinablair on 9/11/16.
 */
public class Display {
    Memory memory = new Memory();
    BasicMath basicMath = new BasicMath();
    ScientificMath scientificMath = new ScientificMath();
    public double state;
    //double state = basicMath.getState();
    Display(){
        this.state = 0.0;
    }
    public double getState(){
        return this.state;
    }
    public Scanner userInput = new Scanner(System.in);
    int option;
    int basicOption;
    int scienceOption;
    int trigOption;
    int logOPtion;
    int trigUnitOption;
    int modeOption;
    int memoryOption;

    public void startCalculator(){
        System.out.println("Welcome to your Calculator.");
    }
    public void optionChoice(){
        System.out.printf("Please select an option:%n1.Basic Operations%n2.Scientific Operations" +
                "%n3.Change Modes%n4.Memory%n5.Clear Display%n6.Exit Calculator%n");
        option = userInput.nextInt();
    }
    public void optionDisplay(){
        this.optionChoice();
        switch(option) {
            case 1:
                this.basicOperations();
                break;
            case 2:
                this.scientificOperations();
                break;
            case 3:
                this.changeModeDisplay();
                break;
            case 4:
                this.clearDisplay();
                break;
            case 5:
                this.exitProgram();
                break;
            default:
                System.out.println("You chose an option that was not on the list. Please try again");
                this.optionChoice();
        }

    }
    public void basicOperations(){
        System.out.printf("Please select an option:%n1.Add%n2.Subtraction%n3.Multiplication%n4.Division" +
                "5.Square%n6.Square Root%n7.Variable Exponent%n8.Change Sign%n9.Back");
        basicOption = userInput.nextInt();

    }
    public void basicCalculations(){
        this.basicOperations();
        System.out.println("Choose number:");
        double number = userInput.nextDouble();
        switch(basicOption) {
            case 1:
                System.out.printf("%d + %d = %d", state, number, basicMath.add(number));
                break;
            case 2:
                System.out.printf("%d - %d = %d", state, number, basicMath.subtract(number));
                break;
            case 3:
                System.out.printf("%d * %d = %d", state, number, basicMath.multiply(number));
                break;
            case 4:
                System.out.printf("%d / %d = %d", state, number, basicMath.divide(number));
                break;
            case 5:
                System.out.printf("%d ^ 2 = %d", number, basicMath.square(number));
                break;
            case 6:
                System.out.printf("sqrt( %d ) = %d", number, basicMath.squareRoot(number));
                break;
            case 7:
                System.out.printf("%d ^ %d = %d", state, number, basicMath.variableExp(number));
                break;
            case 8:
                System.out.printf("%d", state, basicMath.changeSign(number));
                break;
            case 9:
                this.optionChoice();
                break;
            default:
                System.out.println("That option is not on this list. Please try again.");
                this.basicOperations();
        }
    }
    public void scientificOperations(){
        System.out.printf("Please select an option:%n1.Trig Functions%n2.Change Trig Units%n3.Log Functions%n4.Factorial" +
                "%n5.Back");
        scienceOption = userInput.nextInt();

    }
    public void scientific(){
        this.scientificOperations();
        double number = userInput.nextDouble();
        switch(scienceOption){
            case 1:
                this.trigOptions();
                break;
            case 2:
                this.trigUnits();
                break;
            case 3:
                this.logOptions();
                break;
            case 4:
                this.factorial();
                break;
            case 5:
                this.optionChoice();
                break;
            default:
                System.out.println("That was not one of the options. Please try again.");
                this.scientificOperations();

        }
    }
    public void trigOptions(){
        System.out.printf("Please select an option:%n1.Sine%n2.Cosine%n3.Tangent%n4.Inverse Sine%n5.Inverse Cosine" +
                "%n6.Inverse Tangent%n7.Back");
        trigOption = userInput.nextInt();
    }
    public void trigCalculations(){
        this.trigOptions();
        double number = userInput.nextDouble();
        switch(trigOption){
            case 1:
                System.out.printf("sin( %d ) = %d", number, state,scientificMath.sine(number));
                break;
            case 2:
                System.out.printf("cos( %d ) = %d", number, state,scientificMath.cosine(number));
                break;
            case 3:
                System.out.printf("tan( %d ) = %d", number, state,scientificMath.tangent(number));
                break;
            case 4:
                System.out.printf("asin( %d ) = %d", number, state,scientificMath.inverseSine(number));
                break;
            case 5:
                System.out.printf("acos( %d ) = %d", number, state,scientificMath.inverseCosine(number));
                break;
            case 6:
                System.out.printf("atan( %d ) = %d", number, state,scientificMath.inverseTangent(number));
                break;
            case 7:
                this.scientific();
                break;
            default:
                System.out.println("That was not one of the options. Please Try again.");
                this.trigOptions();
        }

    }
    public void trigUnitsOption(){
        System.out.printf("Please select an option:%n1.Degree%n2.Radians%n" +
                "%n3.Back");
        trigUnitOption = userInput.nextInt();

    }
    public void trigUnits(){
        this.trigUnitsOption();
        switch (trigUnitOption){
            case 1:
                scientificMath.toRadians();
                System.out.println("Trig Units are now in Radians");
                break;
            case 2:
                scientificMath.toDegrees();
                System.out.println("Trig Units are now in Degrees");
                break;
            case 3:
                this.trigOptions();
                break;
            default:
                System.out.println("That was not one of the options. Please try again.");
                this.trigUnitsOption();
        }

    }
    public void changeModeDisplay(){


    }
    public void clearDisplay(){
        this.state = 0.0;
        System.out.println(state);
    }
    public void exitProgram(){
        this.state = 0.0;
        System.exit(0);
    }



}
