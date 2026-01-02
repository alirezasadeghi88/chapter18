package com.learn.factorial.homework;

import java.util.Scanner;

public class ComputeFactorialTailRecursion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER NUMBER :");
        int n = scanner.nextInt();

        System.out.println(factorial(n));
    }
    public static long factorial(int n){
        return factorial(n, 1);
    }

    private static long factorial(int n, int result){
        if (n == 0)
            return result;
        else
            return factorial(n - 1, n * result);
    }
}
