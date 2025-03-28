package pl.programujodpodstaw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: (od 1 do 6)");
        int userNumber = scanner.nextInt();

        int[] integersArray = {10, 5, 2, 7, 8, 7};

        int[] maxSubstringArray;

        int maxValueOfSubArray = 0;
        if (userNumber != 1) {
            maxSubstringArray = new int[integersArray.length + 1 - userNumber];
            for (int i = 0; i <= integersArray.length - userNumber; i++) {
                for (int j = i + 1; j < userNumber + i; j++) {
                    int max = Math.max(integersArray[j - 1], integersArray[j]);
                    if (j == i + 1) {
                        maxValueOfSubArray = max;
                    } else if (maxValueOfSubArray < max) {
                        maxValueOfSubArray = max;
                    }
                }
                maxSubstringArray[i] = maxValueOfSubArray;
            }
        }else {
            maxSubstringArray = new int[integersArray.length];
            System.arraycopy(integersArray, 0, maxSubstringArray, 0, integersArray.length);
        }

        for (int n : maxSubstringArray) {
            System.out.println(n);
        }
    }
}