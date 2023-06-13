// 4) К калькулятору из предыдущего ДЗ добавить логирование.
// 4+2=6
// 6-1=5

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        
        Logger logger = Logger.getLogger(App.class.getName());
        FileHandler fh;
        try {  
            fh = new FileHandler("history.log");  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  
            logger.info("Calculator");
            } catch (SecurityException e) {  
                e.printStackTrace();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }

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
                    logger.info(String.format("%s + %s = %s", first, second, (first + second)));
                    System.out.println("Ответ: " + (first + second));
                    break;
                case ("-"):
                    logger.info(String.format("%s - %s = %s", first, second, (first - second)));
                    System.out.println("Ответ: " + (first - second));
                    break;
                case ("*"):
                    logger.info(String.format("%s * %s = %s", first, second, (first * second)));
                    System.out.println("Ответ: " + (first * second));
                    break;
                case ("/"):
                    if (second != 0){
                        logger.info(String.format("%s / %s = %s", first, second, (first / second)));
                        System.out.println("Ответ: " + (first / second));
                        break;
                    } else {System.out.println("На ноль делить нельзя!");}
                }
        }
        scanner.close();
        System.out.println("Выход");
    }
}
