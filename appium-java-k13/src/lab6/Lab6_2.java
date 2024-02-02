package lab6;

import java.util.Scanner;

public class Lab6_2 {
    public static void main(String[] args) {
        String myPassword = "password123";
        checkPassword(myPassword);

        }
    public static void checkPassword(String correctPass ){
        Scanner scanner = new Scanner(System.in);
        int attempts =3;
        while(attempts>0){
            System.out.println("Please enter your password:\n");
            String userInput=scanner.nextLine();
            if(userInput.equals(correctPass)){
                System.out.println("Your password is correct");
                break;
            }
            System.out.println("Your password is not correct");
            attempts--;
            System.out.println("Attempts left: " + attempts);
        }
        if (attempts == 0) {
            System.out.println("You have run out of attempts. Please contact support.");
        }

    }
    }

