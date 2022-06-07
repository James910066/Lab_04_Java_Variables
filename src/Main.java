public class Main {
    public static void main(String[] args)
    {
        int intOperandA = 12;
        int intOperandB = 5;
        int intSum = intOperandA + intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intDifference = intOperandA - intOperandB;
        int intQuotient = intOperandA / intOperandB;
        int intModulo = intOperandA % intOperandB;
        double doubleOperandA = 1.5;
        double doubleOperandB = 3.5;
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;
        double doubleModulo = doubleOperandA % doubleOperandB;

        System.out.println("The sum of using integers of "  + intOperandA + " and " + intOperandB + " is " + intSum);
        System.out.println("The product of using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("The difference between " + intOperandA + " and " + intOperandB + " is " + intDifference);
        System.out.println("The quotient of dividing " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        System.out.println("The remainder of " + intOperandA + " and " + intOperandB + " is " + intModulo);
        System.out.println("The sum of adding " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        System.out.println("The product of multiplying " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The difference between " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The quotient of dividing " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);
        System.out.println("The remainder of dividing " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);
    }
}