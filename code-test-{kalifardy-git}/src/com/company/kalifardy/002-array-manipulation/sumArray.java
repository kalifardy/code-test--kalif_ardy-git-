package com.company.kalifardy;

import java.util.Arrays;
import java.util.Scanner;

public class sumArray {

    public static void main(String args[]) {


        int[] array1 = {3,2,9};
        int[] array2 = {1,2};


        int[] hasilarray = gabungarray(array1, array2);
        printarray(array1, "input");
        printarray(array2, "input");
        System.out.println("=================== ++");
        printarray(hasilarray, "output");

    }

    private static int[] gabungarray (int[] array1, int[] array2) {
        int[] hasil = new int[array2.length];
        for (int i = 0; i < array2.length; i++) {
            hasil[i] = array1[i] + array2[i];
        }

        return hasil;

    }

    private static void printarray (int[] array, String pesan) {
        System.out.println(pesan + " = " + Arrays.toString(array));
    }
}
