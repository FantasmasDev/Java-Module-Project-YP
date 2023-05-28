import java.util.Scanner;

public class Calc {
    String listOfGoods ="";
    Double totalCoast = 0.00;

    public void askItem() {
        //do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите название товара");
            String item = sc.nextLine();

            System.out.println("Введите стоимость товара");
            Double itemCoast = sc.nextDouble();

            totalCoast += itemCoast;
            String coastString = String.format("%.2f", itemCoast);
            listOfGoods += item + " " + coastString + "\n";
        //} while (true);
    }
}
