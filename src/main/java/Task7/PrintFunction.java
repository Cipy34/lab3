package Task7;

public final class PrintFunction {
    public void printing(CalculatorResult calculationResult){
        CalculatorRequest request = calculationResult.getRequest();
        System.out.println("Operation " + request + " has result " + calculationResult.computeResult());
    }
}
