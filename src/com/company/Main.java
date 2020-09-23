package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {3,5,9};
        int[] b = {4,10,12,19};

        int sizeOfC = a.length+b.length;
        int[] c = new int[sizeOfC];

        //posibil e mai bine System.arrayCopy()
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length+i] = b[i];
        }

        Arrays.sort(c);

        int sumOfArray = 0;
        for (int i:c
             ) {
            sumOfArray+=i;
            System.out.print(i+" "); //for testing myself
        }
        System.out.print("\nsum of array is: "+sumOfArray);
    }
}
