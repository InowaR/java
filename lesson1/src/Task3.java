import java.util.Scanner;
import java.io.*;

public class Task3 {
    public static void main(String[] args) throws IOException {
        System.out.println("Программа калькулятор");
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Введите 0 для выхода:");
            System.out.println("Введите первое число A:");
            int first = scanner.nextInt();
            if(first == 0){break;}
            System.out.println("Введите знак (+, -, *, /):");
            String sign = scanner.next();
            System.out.println("Введите второе число B:");
            int second = scanner.nextInt();
            System.out.print("\033\143");
            switch(sign){
                case ("+"):
                    System.out.println("Ответ: " + (first + second));
                    break;
                case ("-"):
                    System.out.println("Ответ: " + (first - second));
                    break;
                case ("*"):
                    System.out.println("Ответ: " + (first * second));
                    break;
                case ("/"):
                    if (second != 0){
                        System.out.println("Ответ: " + (first / second));
                        break;
                    } else {System.out.println("На ноль делить нельзя!");}
                }
        }
        scanner.close();
        System.out.println("Выход"); 
    }
}
