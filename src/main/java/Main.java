
public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        counter.askNumOfPersons();

        Calc calc = new Calc();
        calc.askItem();
        calc.askItem();
        calc.askItem();
        System.out.println(calc.listOfGoods);
        System.out.println(calc.totalCoast);
    }
}