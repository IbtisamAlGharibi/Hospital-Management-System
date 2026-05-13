package Services;

import Util.MenuMessages;

import java.util.Scanner;

public class ReportsService {
    static MenuMessages menuMessages = new MenuMessages();
    static Scanner scanner = new Scanner(System.in);

    public boolean HandleReportsMenu(){
        System.out.println(menuMessages.REPORTS_MENU_MESSAGE);
        System.out.println("Please enter number");
        String reportOption = scanner.nextLine();
        switch (reportOption) {
            case  "7.1" -> {
                System.out.println("DAILY APPOINTMENTS REPORT");
                System.out.println("---------------------------------");
                System.out.println("Please enter the report: ");
                String report = scanner.nextLine();
                System.out.println(report);
            }
            case "7.2" -> {

            }
            case "7.3" -> {

            }

            case  "7.4" -> {

            }
            case "7.5" -> {
            }
            case "7.6" -> {
                return false;
            }
        }
        return true;
    }
}
