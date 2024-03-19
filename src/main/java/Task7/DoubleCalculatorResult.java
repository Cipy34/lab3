package Task7;

public class DoubleCalculatorResult extends CalculatorResult{

    private Object l;
    private Object r;
    private String o;

    public DoubleCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
        l = calculatorRequest.getLeftOperand();
        r = calculatorRequest.getRightOperand();
        o = calculatorRequest.getOperation();
    }

    @Override
    public Double computeResult() {
        if(l instanceof Integer)
            l = (double) ((Integer) l);

        if(r instanceof Integer)
            r = (double) ((Integer) r);

        switch (o){
            case "+":
                return (Double) l + (Double) r;
            case "-":
                return (Double) l - (Double) r;
            case "*":
                return (Double) l * (Double) r;
            case "/":
                return (Double) l / (Double) r;
        }
        return null;
    }
}
