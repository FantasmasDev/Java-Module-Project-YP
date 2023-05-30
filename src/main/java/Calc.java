import java.util.Scanner;

public class Calc {
    String listOfGoods ="";
    double totalCoast = 0.00;

    public void askItem() {
        double itemCoast;
        do {
            Scanner sc = new Scanner(System.in);
            Scanner secSc = new Scanner(System.in);
            System.out.println("Введите название товара");
            String item = sc.nextLine();

            System.out.println("Введите стоимость товара руб.коп, например 10,45");
            if (sc.hasNextDouble()) {
                double checkPositive = sc.nextDouble();

                if (checkPositive >= 0) {
                    itemCoast = checkPositive;
                } else {
                    System.out.println("Извините, но вы ввели отрицательное число, перезапустите программу");
                    break;
                }
            } else {
                System.out.println("Извините, но вы ввели не число, перезапустите программу");
                break;
            }
            System.out.println("Товар " + item + " успешно добавлен");

            totalCoast += itemCoast;
            String coastString = String.format("%.2f", itemCoast);
            listOfGoods += item + " " + coastString + " руб.коп" + "\n";
            System.out.println("Продолжить добавление товаров? Или введите команду \"Завершить\", чтобы прекратить ввод товаров");
            String answer = secSc.nextLine();
            if (answer.equalsIgnoreCase("Завершить")) {
                break;
            }
        } while (true);
    }

    public void showTotalList() {
        System.out.println(listOfGoods);
    }

    public void showTotal (int numOfPerson) {
        double numPersons = (double) numOfPerson;
        double total = totalCoast / numPersons;
        double floorTotal = Math.floor(total);
        String rub = "";
        if (floorTotal % 100 >= 11.00 && floorTotal % 100 <= 14.00) {
            rub = " рублей";
        } else {
            if (floorTotal % 10 == 1.00) {
                rub = " рубль";
            } else if (floorTotal % 10 >= 2.00 && floorTotal % 10 <= 4.00) {
                rub = " рубля";
            } else if (floorTotal == 0.00) {
                rub = " рубль";
            } else {
                rub = " рублей";
            }
        }

        System.out.println("Итого: " + String.format("%.2f", total) + rub);
    }
}
