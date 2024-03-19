package Task7;

public class Main {
    public static void foo(String[] args) {
        SmarterCalculator.setPrint(new PrintFunction());
        SmarterCalculator.calculate(args);
    }

    public static void main(String[] args){

        foo(new String[]{"1", "+", "2",
                "2", "*", "5",
                "1", "+", "5.0",
                "1.0", "-", "2",
                "10.0", "/", "1",
                "true", "||", "false",
                "true", "&&", "true",
                "1.0", "*", "10",
                "1", "&&", "0",
                "true", "+", "0",
                "-10.2", "+", "0.2"});
    }
}
