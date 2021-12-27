package hr.dstr89.demo;

public class App {

    public static void main( String[] args ) {
        System.out.println( "Hello World!" + getDoubleUsingIf(123d) );

        getDoubleUsingIf("123");
    }

    static double getDoubleUsingIf(Object o) {
        return switch (o) {
            case Integer i -> i.doubleValue();
            case Float f -> f.doubleValue();
            case String s -> Double.parseDouble(s);
            default -> 0d;
        };
    }

}
