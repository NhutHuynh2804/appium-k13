package lab2;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number we will check it odd or even number:");
        int Num = scanner.nextInt();
        if (Num % 2 == 0){
            System.out.println("It is even number:"+Num);
        }else {
            System.out.println("It is odd number:"+Num);
        }
    }
}
