import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Notebook> makeArrayList() {
        Notebook macbookPro = new Notebook("MacBook Pro", "Apple", 2000);
        Notebook lenovo = new Notebook("Lenovo Idea Pad", "Lenovo", 500);
        Notebook acer = new Notebook("Acer Aspire One", "Acer", 100);
        List<Notebook> Laptops = new ArrayList<>();
        Laptops.add(macbookPro);
        Laptops.add(lenovo);
        Laptops.add(acer);
        return Laptops;
    }

    public static void main(String[] args) {
        System.out.print("\033\143");
        System.out.println("Здравствуйте, вы находитесь на странице выбора ноутбуков.");
        System.out.println("Список ноутбуков в наличии:");
        List<Notebook> Laptops = makeArrayList();
        Menu menu = new Menu(Laptops);
        menu.showLaptops(Laptops);
        System.out.println("Для сортировки ноутбуков по критериям введите число:");
        System.out.println("1: По алфавиту");
        System.out.println("2: По возрастанию цены");
        System.out.println("3: По убыванию цены");
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        scanner.close();
        switch (select) {
            case 1:
                System.out.print("\033\143");
                System.out.println("Ноутбуки по алфавиту:");
                menu.sortByAscendingManufacturer(Laptops);
                menu.showLaptops(Laptops);
                break;
            case 2:
                System.out.print("\033\143");
                System.out.println("Ноутбуки по возрастанию цены:");
                menu.sortByAscendingPrice(Laptops);
                menu.showLaptops(Laptops);
                break;
            case 3:
                System.out.print("\033\143");
                System.out.println("Ноутбуки по убыванию цены:");
                menu.sortByDescendingPrice(Laptops);
                menu.showLaptops(Laptops);
                break;
            default:
                System.out.print("\033\143");
                System.out.println("Список ноутбуков в наличии:");
                menu.showLaptops(Laptops);
                break;
        }
        // menu.sortByAscendingPrice(Laptops);
        // menu.showLaptops(Laptops);
        // menu.sortByAscendingManufacturer(Laptops);
        // menu.showLaptops(Laptops);
    }
}