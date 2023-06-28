import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Menu {
    List<Notebook> laptops;

    public Menu(List<Notebook> laptops) {
        this.laptops = laptops;
    }

    public void showLaptops(List<Notebook> laptops) {
        System.out.println("----------------------------------------------");
        System.out.println("Model\t\t\tManufacturer\tPrice");
        System.out.println("----------------------------------------------");
        for (Notebook laptop : laptops){
            System.out.println(laptop);
        }
        System.out.println("----------------------------------------------");
        System.out.println("\n");
    }

    public void sortByAscendingPrice(List<Notebook> laptops) {
        Collections.sort(laptops, new Comparator<Notebook>() {
            @Override
            public int compare(Notebook notebook1, Notebook notebook2) {
                return Double.compare(notebook1.getPrice(), notebook2.getPrice());
            }
        });
    }

    public void sortByDescendingPrice(List<Notebook> laptops) {
        Collections.sort(laptops, new Comparator<Notebook>() {
            @Override
            public int compare(Notebook notebook1, Notebook notebook2) {
                return Double.compare(notebook2.getPrice(), notebook1.getPrice());
            }
        });
    }
}
