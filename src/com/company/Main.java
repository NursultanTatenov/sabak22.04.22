package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] a = {5, 6, 7, 4, 6, 8, 9};

        System.out.println("\n"+method(a));
    }

    static int method(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
            if (a[i] < min) {
                min = a[i];
            }}

            return min;
        }}


