package SimpleOperationsAndCalculations;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int needHours = projects * 3;
        System.out.printf("The architect %s will need %d hours to complete %d projects.", name, needHours, projects);
    }
}