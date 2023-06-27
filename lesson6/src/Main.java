import java.util.ArrayList;

public class Main {

    public static ArrayList<Notebook> makeArrayList() {
        Notebook macbookPro = new Notebook("MacBook Pro", "Apple", 2000);
        Notebook lenovo = new Notebook("Lenovo Idea Pad", "Lenovo", 1000);
        ArrayList<Notebook> Laptops = new ArrayList<>();
        Laptops.add(macbookPro);
        Laptops.add(lenovo);
        return Laptops;
    }

    public static void main(String[] args) {
        ArrayList<Notebook> Laptops = makeArrayList();
        Menu menu = new Menu(Laptops);
        menu.showLaptops(Laptops);    
    }
}