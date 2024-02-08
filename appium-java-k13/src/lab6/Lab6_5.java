package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab6_5 {
    /**
     * Create a method count words on string
     * handle input word into map
     * after handle count the same word and print
     * */
    public static void main(String[] args) {
       String userInput= getUserInput();
        countWord(userInput);
        checkWordAppear(userInput);

    }

    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence\n");
        String userSentence=scanner.nextLine();
        System.out.println("This sentence is:\n"+userSentence);

        return userSentence;
    }
    public static void countWord(String input){
        if (isInvalidInput(input)) {
            return;
        }
        String[] words = input.split("\\s+");
        System.out.println("Total words is:" + words.length);
    }

    public static void checkWordAppear(String input) {
        if (isInvalidInput(input)) {
          return;
        }
        Map<String,Integer> wordsWithCount = new HashMap<String,Integer>();
        String [] words = input.split("\\s+");
        for (String word : words) {
            if(wordsWithCount.containsKey(word)){
                wordsWithCount.put(word,wordsWithCount.get(word)+1);
            }else{
                wordsWithCount.put(word,1);
            }

        }
        System.out.println(wordsWithCount);
    }
    public static boolean isInvalidInput(String input){
        if(input==null||input.isEmpty()){
            System.out.println("Please input a valid sentence");
            return true;
        }
        return false;
    }
}
