public class Calculator {
    public static double calculate(double n1, String operator, double n2){
        switch (operator) {
            case "+":
                return  n1+n2;

            case "-":
                return n1-n2;

            case "*":
                return n1*n2;

            case "/":
                if (n2==0){
                    throw new RuntimeException("Can't divide by zero");
                }
                return n1/n2;
            default:
                return 0;

        }

    }
}
