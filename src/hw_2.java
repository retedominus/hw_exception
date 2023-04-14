import java.util.Scanner;

public class hw_2 {

    public static void main(String[] args) {
        System.out.println(floatInput());
//        divRes(new int[] {2, 3, 6, 6, 3, 5, 8, 9}, 7);
    }


    //Задание 1 - написать метод приема у пользователя float number и вывод на экран, если нет ошибки ввода,
    // иначе повторный запрос ввода

    // Вариант 1
    private static float floatInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input float argument: ");
        try {
            return input.nextFloat();
        } catch (Exception ignored) {
            System.err.println("\nInvalid input. Please, enter a float argument.");
            input.nextLine(); // очистка буфера
            return floatInput();
        } finally {
            input.close();
        }
    }

    // Вариант 2
    public static float getFloatInput() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Input float argument: ");
            if (input.hasNextFloat()) {
                return input.nextFloat();
            }
            System.err.println("\nInvalid input. Please, enter a float argument.");
            input.nextLine();
        }

    }

    //Задание 2 - Исправить код - он не имеет смысла, т.к. он всегда будет приводить в исключению - значение d
    // будет аргументом метода
    private static void divRes(int[] intArray, int d) {//оформил в метод
        try {
            int caughtRes1 = intArray[8] / d; //так как в имени массива указано, что он целочисленный нет смысла
            // возвращать double; изменил имя переменной
            System.out.println("caughtRes1 = " + caughtRes1);
        } catch (ArithmeticException |
                 IndexOutOfBoundsException e) { //добавил исключение на случай короткого массива
            System.out.println("Catching exception: " + e);
        }
    }


    //Задание 3 - Исправить код

    public static void main1(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = new int[4];
            abc[3] = 9;
        } catch (IllegalArgumentException e) {
            System.out.println("Введен неверный агрумент");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(int a, int b) throws IllegalArgumentException {
        System.out.println(a + b);
    }
}


