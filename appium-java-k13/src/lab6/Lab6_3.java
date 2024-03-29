package lab6;

import java.util.ArrayList;
import java.util.List;

public class Lab6_3 {
    public static void main(String[] args) {
        String myStr = "10098 minutes and 404354 seconds";
        extractNum(myStr);

    }
    public static String arrayNumToString(List<Integer> arrayNum) {
        StringBuilder result = new StringBuilder();
        for (Integer num : arrayNum) {
            result.append(num);
        }
        return result.toString().trim();
    }

    public static void extractNum(String myStr) {
        List<Integer> arrayNum = new ArrayList<>();
        char [] charArray = myStr.toCharArray();
        for (char character : charArray) {
            if(Character.isDigit(character)){
                arrayNum.add(Integer.parseInt(Character.toString(character)));
            }

        }
        String arrayNumString = arrayNumToString(arrayNum);
        System.out.println("Extract the number in array is:"+arrayNumString );
    }
}
