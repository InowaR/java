// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
// Требуется восстановить выражение до верного равенства.
// Знаки вопроса - одинаковые цифры.
// Предложить хотя бы одно решение или сообщить, что его нет.

package lesson1.src;
public class Task4 {
    public static void main(String[] args) {
        boolean flag = false;
        int i = 0;
        while(i < 10) {
            String n = String.valueOf(i);
            String eq = "2? + ?5 = 69";
            String replacedString = eq.replace("?", n);
            String[] words = replacedString.split(" ");
            String first = words[0];
            String second = words[2];
            String third = words[4];
            System.out.println(first + ", " + second + ", " + third);
            int f = Integer.valueOf(first);
            int s = Integer.valueOf(second);
            int t = Integer.valueOf(third);
            System.out.println(f + s + t);
            if(f + s == t){System.out.println("Есть!"); flag = true; break;}
            i++;
        }
        if(flag == false){
            System.out.println("Нет!");
        }
    }
    
}
