package main.application;
import java.util.Scanner;

public class matematica {

    public static void main(String[] args){

        int a, b, result;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor de A: ");
        a = sc.nextInt();
        System.out.println("Insira o valor de B: ");
        b = sc.nextInt();
        int c = sc.nextInt();


        result = (a +b) / c;

        System.out.println("O resultado da soma é de: " + result);
        System.out.println(c);

        sc.close();


    }
    
}
