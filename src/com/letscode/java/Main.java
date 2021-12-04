package com.letscode.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.printf("Digite a Temperatura: ");
        Scanner tempValueScanner = new Scanner(System.in);
        final float celsius = tempValueScanner.nextFloat();

        float tempF = (celsius * 1.8f) + 32;



        System.out.printf("%.2fºC em Fahrenheit é: %.2f %n", celsius, tempF);
    }
}
