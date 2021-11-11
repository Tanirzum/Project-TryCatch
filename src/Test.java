import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Пишите любое число который принимает int");
            try {
                int value = scanner.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("int не принимает такое значение");
            } catch (RuntimeException runtimeException) {
                System.out.println("Ошибка");
            } finally {
                System.out.println("До свидания!");
                break;
            }
        }
    }
}
