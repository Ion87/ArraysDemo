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

        //Arrays.sort(c);
        int[] finalC = arange(c);

        int sumOfArray = 0;
        for (int i:finalC
             ) {
            sumOfArray+=i;
            System.out.print(i+" "); //for testing myself
        }
        System.out.print("\nsum of array is: "+sumOfArray);
    }

    public static int[] arange(int[] array){
        boolean flag;
        while (true) {
            flag = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    flag = false;
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
            }
            if (flag)return array;
        }
    }
}
