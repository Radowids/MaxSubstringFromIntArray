package pl.programujodpodstaw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: (od 1 do 6)");
        int userNumber = scanner.nextInt();

        int[] integersArray = {10, 5, 2, 7, 8, 7};

        for (int n : Main.maxValueOfUserSubArray(integersArray, userNumber)) {
            System.out.print(n + " ");
        }
    }

    public static int[] maxValueOfUserSubArray(int[] integersArray, int userNumber){
        int[] maxSubArray;

        int maxValueOfSubArray = 0;
        if (userNumber != 1) {
            maxSubArray = new int[integersArray.length + 1 - userNumber];
            for (int i = 0; i <= integersArray.length - userNumber; i++) {
                for (int j = i + 1; j < userNumber + i; j++) {
                    int max = Math.max(integersArray[j - 1], integersArray[j]);
                    if (j == i + 1) {
                        maxValueOfSubArray = max;
                    } else if (maxValueOfSubArray < max) {
                        maxValueOfSubArray = max;
                    }
                }
                maxSubArray[i] = maxValueOfSubArray;
            }
        }else {
            maxSubArray = new int[integersArray.length];
            System.arraycopy(integersArray, 0, maxSubArray, 0, integersArray.length);
        }
        return maxSubArray;
    }

}