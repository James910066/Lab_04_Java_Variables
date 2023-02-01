public class JavaVariables
{
    public static void main(String[] args)
    {
        //Declaring all integer variables and with initial assignment
        int intOperandA = 12;
        int intOperandB = 6;
        int intSum = 1;
        int intProduct = 6;
        int intDifference = 2;
        int intQuotient = 8;
        int intModulo = 4;
        //Declaring all double variables with initial assignment
        double doubleOperandA = 1.5;
        double doubleOperandB = 2.5;
        double doubleSum = 3.4;
        double doubleProduct = 6.6;
        double doubleDifference = 7.2;
        double doubleQuotient = 2.9;
        double doubleModulo = 1.4;

        intSum = intOperandA + intOperandB; //Assignment that uses the + arithmetic addition operator
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum); //Output statement

        intProduct = intOperandA * intOperandB; //Assignment that uses the * arithmetic multiplication operator
        System.out.println("The product of using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct); //Output statement

        intDifference = intOperandA - intOperandB; //Assignment that uses the - arithmetic subtraction operator
        System.out.println("The difference of using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference); //Output statement

        intQuotient = intOperandA / intOperandB; //Assignment that uses the / arithmetic division operator
        System.out.println("The dividend of using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient); //Output statement

        intModulo = intOperandA % intOperandB; //Assignment that uses the % arithmetic modulo operator
        System.out.println("The remainder of using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo); //Output statement

        doubleSum = doubleOperandA + doubleOperandB; //Assignment that uses the + arithmetic addition operator
        System.out.println("The sum of using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum); //Output statement

        doubleProduct = doubleOperandA * doubleOperandB; //Assignment that uses the * arithmetic multiplication operator
        System.out.println("The product of multiplying " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct); //Output statement

        doubleQuotient = doubleOperandA / doubleOperandB; //Assignment that uses the / arithmetic division operator
        System.out.println("The quotient of dividing " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient); //Output statement

        doubleDifference = doubleOperandA - doubleOperandB; //Assignment that uses the - arithmetic subtraction operator
        System.out.println("The difference between " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference); //Output statement

        doubleModulo = doubleOperandA % doubleOperandB; //Assignment that uses the % arithmetic modulo operator
        System.out.println("The remainder between " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo); //Output statement
    }
}