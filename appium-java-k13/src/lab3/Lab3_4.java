package lab3;

import java.util.Arrays;

public class Lab3_4 {
    public static void main(String[] args) {
        int[] intArr1 = {1, 0, -1, 4, 5, 21, 10};
        int[] intArr2 = {-1, 26, 55, 44, 10};
        int a1 = intArr1.length;
        int a2 = intArr2.length;
        int a3 = a1+a2;
        int[] intArr3= new int [a3];

        for (int index1 = 0; index1 <a1 ; index1++) {
            intArr3[index1] = intArr1[index1];
        }
        for (int index2 = 0; index2 <a2 ; index2++) {
            intArr3[a2+index2] = intArr2[index2];
        }
        //Sort Array after merge
        for (int index3 = 0; index3 < a3; index3++) {
            int keyValue = intArr3[index3];
            int j=index3-1;
            while (j>=0 && intArr3[j]>keyValue){
                intArr3[j+1]=intArr3[j];
                j=j-1;
            }
            intArr3[j+1]=keyValue;
        }

        System.out.println("After sorted Array3"+ Arrays.toString(intArr3));
    }
}
