// 2) Вывести все простые числа от 1 до 1000

package lesson1;
import java.util.Scanner;
import java.io.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("Простые числа до числа " + number + ":");
        for (int i = 2; i <= number; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

        if(isPrimeNumber){
            System.out.print(i + ", ");
            }
        }
    System.out.println();
    }
}