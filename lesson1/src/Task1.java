// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;
import java.io.*;
public class Task1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n:");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(n + " треугольное число: " + calculate(n));
    }

    public static int calculate(int n){
        return (n * (n + 1)) / 2;  
    }
}
