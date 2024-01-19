package lab3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab3_3 {
    public static void main(String[] args) {
        int[] intArr = {1, 0, -1, 4, 5, 21, 10};

        for (int index = 1; index <intArr.length ; index++) {
            int keyValue =intArr[index];
            int j=index-1;
            while (j>=0 && intArr[j]>keyValue){
                intArr[j+1]=intArr[j];
                j=j-1;
            }
            intArr[j+1]=keyValue;
        }
        System.out.println("After sorted"+ Arrays.toString(intArr));
    }
}
