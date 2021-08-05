package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double vnd = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so tien USD: ");
        double usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.print("Gia tri VND: " + quydoi);
    }
}
