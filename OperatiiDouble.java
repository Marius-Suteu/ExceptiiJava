import java.util.List;
    public class OperatiiDouble implements ICalculator{
        
        
    public double add(Double a, Double b) throws NullParameterException, 
    OverflowException, UnderflowException {
        if (a == null || b == null) {
            throw new NullParameterException("Unul sau ambii parametrii sunt null.");
        }

        double result = a + b;
        if (result == Double.POSITIVE_INFINITY) {
            throw new OverflowException("Suma depaseste Double.POSITIVE_INFINITY");
        } else if (result == Double.NEGATIVE_INFINITY) {
            throw new UnderflowException("Suma depaseste Double.NEGATIVE_INFINITY");
        }

        return result;
    }

    public double divide(Double a, Double b) throws NullParameterException,
     OverflowException, UnderflowException {
        if (a == null || b == null) {
            throw new NullParameterException("Unul sau ambii parametriisunt null.");
        }

        if (b == 0.0) {
            throw new ArithmeticException("Impartire cu zero.");
        }

        double result = a / b;
        if (result == Double.POSITIVE_INFINITY) {
            throw new OverflowException("Rezultatul impartirii depaseste Double.POSITIVE_INFINITY");
        } else if (result == Double.NEGATIVE_INFINITY) {
            throw new UnderflowException("Rezultatul impartirii depaseste Double.NEGATIVE_INFINITY");
        }

        return result;
    }

    public double average(List<Double> values) throws NullParameterException, 
    OverflowException, UnderflowException {
        if (values == null) {
            throw new NullParameterException("Lista de intrare este null.");
        }

        if (values.isEmpty()) {
            throw new IllegalArgumentException("Lista de intrare este goala.");
        }

        double sum = 0.0;
        for (Double value : values) {
            sum = add(sum, value); 
        }

        return divide(sum, (double) values.size());
    }
}