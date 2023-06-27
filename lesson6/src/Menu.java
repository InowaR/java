import java.util.ArrayList;

public class Menu {
    ArrayList<Notebook> laptops;

    public Menu(ArrayList<Notebook> laptops) {
        this.laptops = laptops;
    }

    public void showLaptops(ArrayList<Notebook> laptops) {
        for (Notebook laptop : laptops){
            System.out.println(laptop);
        }
    }
}
