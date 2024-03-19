package Task7;

import java.util.List;

public record SmarterCalculator() {
    private static PrintFunction print;

    public static void setPrint(PrintFunction print2){
        print = print2;
    }
    public static void calculate(String[] args){
        InputConverter inputConverter = new InputConverter();

        for(int i = 0; i <args.length; i+=3){
            List<CalculatorRequest> l = (inputConverter.mapRequests(new String[]{args[i], args[i + 1], args[i + 2]}));

            for(CalculatorRequest a : l){
                switch (a.getRequestType()) {
                    case "Integer":
                        print.printing(new IntegerCalculatorResult(a));
                        break;
                    case "Double":
                        print.printing(new DoubleCalculatorResult(a));
                        break;
                    case "Boolean":
                        print.printing(new BooleanCalculatorResult(a));
                        break;
                }
            }
        }
    }
}
