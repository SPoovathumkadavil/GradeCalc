package com.SalAPoov;

import java.util.Scanner;

public class Main {
    public static String calc(double grade) {
        if (grade >= 50D) {
            if (grade >= 63)  {
                if (grade >= 73) {
                    if (grade >= 83) {
                        if (grade >= 93) {
                            return "A";
                        } else {
                            return "B";
                        }
                    } else {
                        return "C";
                    }
                } else {
                    return "D";
                }
            } else {
                return "F";
            }
        } else {
            return "F";
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double d = scan.nextDouble();
        System.out.println(calc(d));
    }
}
