import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Notebook> makeArrayList() {
        Notebook macbookPro = new Notebook("MacBook Pro", "Apple", 2000);
        Notebook lenovo = new Notebook("Lenovo Idea Pad", "Lenovo", 1000);
        List<Notebook> Laptops = new ArrayList<>();
        Laptops.add(macbookPro);
        Laptops.add(lenovo);
        return Laptops;
    }

    public static void main(String[] args) {
        List<Notebook> Laptops = makeArrayList();
        Menu menu = new Menu(Laptops);
        menu.showLaptops(Laptops);
        menu.sortByAscendingPrice(Laptops);
        menu.showLaptops(Laptops);
          
    }
}