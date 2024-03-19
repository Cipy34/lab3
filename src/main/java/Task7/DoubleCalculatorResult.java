package Task7;

public final class DoubleCalculatorResult extends CalculatorResult{

    private Object l;
    private Object r;
    private final String o;

    public DoubleCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
        l = calculatorRequest.leftOperand();
        r = calculatorRequest.rightOperand();
        o = calculatorRequest.operation();
    }

    @Override
    public Double computeResult() {
        if(l instanceof Integer)
            l = (double) ((Integer) l);

        if(r instanceof Integer)
            r = (double) ((Integer) r);

        return switch (o) {
            case "+" -> (Double) l + (Double) r;
            case "-" -> (Double) l - (Double) r;
            case "*" -> (Double) l * (Double) r;
            case "/" -> (Double) l / (Double) r;
            default -> null;
        };
    }
}
