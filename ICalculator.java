import java.util.List;

public interface ICalculator {
    
    double add(Double a, Double b) throws NullParameterException, OverflowException, UnderflowException;
    double divide(Double a, Double b) throws NullParameterException, OverflowException, UnderflowException;
    double average(List<Double> values) throws NullParameterException, OverflowException, UnderflowException;

    class NullParameterException extends Exception {
        public NullParameterException(String message) {
            super(message);
        }
    }

    class OverflowException extends Exception {
        public OverflowException(String message) {
            super(message);
        }
    }

    class UnderflowException extends Exception {
        public UnderflowException(String message) {
            super(message);
        }
    }
}

    

