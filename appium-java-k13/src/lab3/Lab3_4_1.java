package lab3;

import java.util.Arrays;

public class Lab3_4_1 {
    public static void main(String[] args) {
        int[] intArr1 = {1, 10,13,17,17};
        int[] intArr2 = {2,19,22};
        int a1Lenght = intArr1.length;
        int a2Lenght = intArr2.length;
        int [] intArr3 = new int[a1Lenght + a2Lenght];
        int a1Position, a2Position, a3Position;
        a1Position = a2Position = a3Position = 0;

        while (a1Position < a1Lenght && a2Position < a2Lenght) {
            if (intArr1[a1Position] < intArr2[a2Position]) {
                intArr3[a3Position++] = intArr1[a1Position++];
            } else {
                intArr3[a3Position++] = intArr2[a2Position++];
            }
        }
            while (a1Position<a1Lenght){
                intArr3[a3Position++]=intArr1[a1Position++];

            }
            while (a2Position<a2Lenght){
                intArr3[a3Position++]=intArr2[a2Position++];
            }

        System.out.println("Array after sorted:"+ Arrays.toString(intArr3));

    }
}
