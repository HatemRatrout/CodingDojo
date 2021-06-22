public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        calc1.setOperandOne(10.5);
        calc1.setOperation("+");
        calc1.setOperandTwo(5.2);
        calc1.performOperation();
        System.out.println(calc1.getResults());

        Calculator calc2 = new Calculator();
        calc2.setOperandOne(10.5);
        calc2.setOperation("-");
        calc2.setOperandTwo(5.2);
        calc2.performOperation();
        System.out.println(calc2.getResults());
    }
}