import java.util.Scanner;

public class Counter {
    int persons;

    public void askNumOfPersons() {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("На сколько персон поделить счёт?");
            persons = sc.nextInt();
            if (persons == 1) {
                System.out.println("Нет смысла делить счёт.");
            } else if (persons < 1) {
                System.out.println("Количество персон меньше 1, это не корректное значение.");
            } else if (persons > 1) {
                break;
            }
        }
    }
}
