public class Main {
    public static void main(String[] args){
        TipCalculator calculator = new TipCalculator();
        double result = calculator.calculateTip(100,20);
        System.out.println(result);
    }
}
