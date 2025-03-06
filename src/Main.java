import portfolio.Portfolio;
import java.util.Scanner;
import static menu.Menu.showMenu;

public class Main {
    public static void main(String[] args) {
        // TODO: Opret en Scanner instance
        Scanner scanner = new Scanner(System.in);
        // TODO: Opret en Portfolio instance
        Portfolio portfolio = new Portfolio(200);

        // TODO: Show menu
        showMenu(portfolio, scanner);
        // TODO: Luk scanneren
        scanner.close();
    }
}
