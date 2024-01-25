package lab4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
/*
*Write a method printMenu
*Write a method get user option
*Write a method generate random Array
*write a method find min num
*write a method find max num
*write a method search num and return index
*enhance nagative number user input
*/

        int [] randomArr = generateArray();
        int userOption = 0;

        while (userOption!=5){
            printMenu();
            userOption=getUserInput();
            switch (userOption){
                case 1:
                    for (int num : randomArr) {
                        System.out.println("Test Araay is:"+num);
                    }
                    break;
                case 2:
                    System.out.println("Max number in array is"+maxNum(randomArr));
                    break;
                case 3:
                    System.out.println("Max number in array is"+minNum(randomArr));
                    break;
                case 4:
                    System.out.println("Please enter search number");
                    int searchNum=getUserInput();
                    int foundIndex = searchNum(randomArr,searchNum);
                    if(!(searchNum==-1)){
                        System.out.println("Search number at index"+foundIndex);
                    }else {
                        System.out.println("Number not found");
                    }
                    break;
                case 5:
                    System.out.println("See you next time");
                    break;
                default:
                    System.out.println("Please enter a valid number");

            }
        }
    }

    public static void printMenu() {
        System.out.println("=====MENU======");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
        System.out.println("5. See you next time");
    }
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please chose the option");
        return scanner.nextInt();
    }
    public static int[] generateArray(){
        //Random Array length 6 and elemens under 1000
        Random rand = new Random();
        int arrLenght = 6;
        int [] intArr = new int [arrLenght];
        for (int index = 0; index < intArr.length; index++) {
            intArr[index] = rand.nextInt(1000);
        }
        return intArr;
    }

    public static int minNum(int[]arr){
        int minNum=arr[0];
        for (int index = 0; index <arr.length ; index++) {
            if(arr[index]<minNum){
                minNum=arr[index];
            }
        }
        return minNum;
    }

    public static int maxNum(int[]arr){
        int maxNum=0;
        for (int index = 0; index <arr.length ; index++) {
            if(arr[index]>maxNum){
                maxNum=arr[index];
            }
        }
        return maxNum;
    }

    public static int searchNum(int[]arr,int targetNum){
        for (int index = 0; index <arr.length ; index++) {
            if(arr[index]==targetNum){
                return index;
            }
        }
        return -1;
    }

}
