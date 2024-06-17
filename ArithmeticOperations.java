import java.util.Scanner;

public class ArithmeticOperations {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Введите число (a): ");
int a = scanner.nextInt();

System.out.println("Введите число (b): ");
int b = scanner.nextInt();

if (a > b) {
System.out.println("a > b");
} else if (a < b) {
System.out.println("a < b");
} else {
System.out.println("a = b");
}

System.out.println("Сложение: " + (a + b));
System.out.println("Вычитание: " + (a - b));
System.out.println("Умножение: " + (a * b));

if (b != 0) {
System.out.println("Деление: " + ((double) a / b));
} else {
System.out.println("Деление на ноль невозможно.");
}
}
}