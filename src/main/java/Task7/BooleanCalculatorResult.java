package Task7;

public final class BooleanCalculatorResult extends CalculatorResult{
    private final Object l;
    private final Object r;
    private final String o;

    public BooleanCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
        l = calculatorRequest.leftOperand();
        r = calculatorRequest.rightOperand();
        o = calculatorRequest.operation();
    }

    @Override
    public Boolean computeResult() {
        return switch (o) {
            case "&&" -> (Boolean) l && (Boolean) r;
            case "||" -> (Boolean) l || (Boolean) r;
            default -> null;
        };
    }
}
