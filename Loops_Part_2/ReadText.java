package Loops_Part_2;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        while (!text.equals("Stop")){
            text = scanner.nextLine();
        }
    }
}