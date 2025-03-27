package pl.programujodpodstaw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: (od 1 do 6)");
        int k = scanner.nextInt();

        int[] integersArray = new int[6];
        integersArray[0] = 10;
        integersArray[1] = 5;
        integersArray[2] = 2;
        integersArray[3] = 7;
        integersArray[4] = 8;
        integersArray[5] = 7;

        int[] maxSubstringArray = new int[6];

        int maxValueOfNextKNumbers = 0;
        int secondMaxValue = 0;
        for (int i = 0; i <= integersArray.length - k; i++) {
            for (int j = i + 1; j < k + i; j++) {
                int max = Math.max(integersArray[j - 1], integersArray[j]);
                if (j == i + 1) {
                    maxValueOfNextKNumbers = max;
                } else if (maxValueOfNextKNumbers < max) {
                    maxValueOfNextKNumbers = max;
                }
            }
            maxSubstringArray[i] = maxValueOfNextKNumbers;
        }

        for (int n : maxSubstringArray) {
            System.out.println(n);
        }
    }
}