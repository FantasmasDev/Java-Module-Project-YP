import java.util.Scanner;

public class Counter {
    int persons;
    boolean state = false;

    public void askNumOfPersons() {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("На сколько персон поделить счёт?");
            if (sc.hasNextInt()) {
                persons = sc.nextInt();
            } else {
                System.out.println("Извините, но вы ввели не число, перезапустите программу");
                break;
            }
            if (persons == 1) {
                System.out.println("Нет смысла делить счёт.");
            } else if (persons < 1) {
                System.out.println("Количество персон меньше 1, это не корректное значение.");
            } else if (persons > 1) {
                state = true;
                break;
            }
        }
    }

    public int getPersons() {
        return persons;
    }
}
