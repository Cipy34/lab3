package Task7;

public record CalculatorRequest(Object leftOperand, Object rightOperand, String operation) {

    public String getRequestType() {
        if (leftOperand instanceof Boolean) {
            if (rightOperand instanceof Boolean)
                return "Boolean";
            return "Invalid";
        }

        if (rightOperand instanceof Boolean) {
            return "Invalid";
        }

        if (leftOperand instanceof Integer && rightOperand instanceof Integer)
            return "Integer";

        if (leftOperand instanceof Double || rightOperand instanceof Double)
            return "Double";

        return "Invalid";
    }

    @Override
    public String toString() {
        return leftOperand + " " + operation + " " + rightOperand;
    }
}
