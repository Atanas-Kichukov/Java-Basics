package NestedLoops_Exercise;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++){
                for (char k = 'a'; k < 'a' + l; k++){
                    for (char v = 'a'; v < 'a' + l; v++){
                        for (int r = Math.max(i, j) + 1; r <= n; r++){
                            System.out.printf("%d%d%c%c%d ", i, j, k, v, r);
                        }
                    }
                }
            }
        }
    }
}