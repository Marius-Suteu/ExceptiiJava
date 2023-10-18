import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ICalculator.OverflowException, ICalculator.UnderflowException, ICalculator.NullParameterException {
        OperatiiDouble calculator = new OperatiiDouble();

        // Testul cu NullParameterException
        try {
            calculator.add(null, 5.0);
        } catch (ICalculator.NullParameterException e) {
            System.out.println("NullParameterException: " + e.getMessage());
        }

        // Testul cu OverflowException
        try {
            calculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
        } catch (ICalculator.OverflowException e) {
            System.out.println("OverflowException: " + e.getMessage());
        }

        // Testul cu UnderflowException
        try {
            calculator.add(-Double.MAX_VALUE, -Double.MAX_VALUE);
        } catch (ICalculator.UnderflowException e) {
            System.out.println("UnderflowException: " + e.getMessage());
        }

        // Testul cu ArithmeticException (Division by zero)
        try {
            calculator.divide(10.0, 0.0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException (Impartire cu zero): " + e.getMessage());
        }

        // Testul cu average și excepții propagate
        List<Double> values = new ArrayList<>(Arrays.asList(1.0, 2.0, null, 4.0, 5.0));
        try {
            calculator.average(values);
        } catch (ICalculator.NullParameterException | ICalculator.OverflowException | ICalculator.UnderflowException e) {
            System.out.println("Exception in average method: " + e.getMessage());
        }
    }
}
