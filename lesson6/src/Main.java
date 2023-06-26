public class Main {

    public static void main(String[] args) {
        Notebook notebook = new Notebook("MacBook Pro", "Apple", 2000);
        System.out.println(notebook.getPrice());
        notebook.setPrice(1000);
        System.out.println(notebook.getPrice());
    }
}