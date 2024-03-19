package Task7;

public final class IntegerCalculatorResult extends CalculatorResult{
    private final Object l;
    private final Object r;
    private final String o;

    public IntegerCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
        l = calculatorRequest.leftOperand();
        r = calculatorRequest.rightOperand();
        o = calculatorRequest.operation();
    }

    @Override
    public Integer computeResult() {
        return switch (o) {
            case "+" -> (Integer) l + (Integer) r;
            case "-" -> (Integer) l - (Integer) r;
            case "*" -> (Integer) l * (Integer) r;
            case "/" -> (Integer) l / (Integer) r;
            default -> null;
        };
    }
}
