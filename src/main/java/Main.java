
public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        counter.askNumOfPersons();
        if(counter.state) {
            Calc calc = new Calc();
            calc.askItem();
            calc.showTotalList();
            calc.showTotal(counter.getPersons());
        }
    }
}