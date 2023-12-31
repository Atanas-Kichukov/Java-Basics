package Loops_Part_2;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int counter = 1;

        while (counter <= n) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number > max) {
                max = number;
            }
            counter++;
        }
        System.out.println(max);
    }
}