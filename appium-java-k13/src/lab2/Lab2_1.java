package lab2;

import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your height:");
        float height = scanner.nextFloat();
        System.out.println("Please enter your weight:");
        float weight = scanner.nextFloat();
        float BMI = weight / (height * 2);
        System.out.println("Your BMI:"+BMI);

        if(BMI<=18.5){
            System.out.println("You must increase your weight:\n"+(BMI-18.5)*(height*2));
        } else if (BMI<=24.9) {
            System.out.println("Your BMI is good Please maintain your health and weight:\n");
        } else if (BMI<=29.9) {
            System.out.println("Your must decrease your weight:\n"+(BMI-24.9)*(height*2));
        }else {
            System.out.println("Your must decrease your weight:\n"+(BMI-24.9)*(height*2));
        }


    }

}
