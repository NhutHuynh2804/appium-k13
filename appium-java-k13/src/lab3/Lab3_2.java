package lab3;

public class Lab3_2 {
    public static void main(String[] args) {
        int[] intArr = {1, 0, -1, 4, 5,21,20};
        int maxNumber=0,minNumber=intArr[0];
        for (int i : intArr) {
            if (i >= maxNumber) {
                maxNumber = i;
            }else if(i <= minNumber) {
                minNumber = i;
            }
        }
        System.out.println("Min number in array is:"+minNumber);
        System.out.println("Max number in array is:"+maxNumber);

    }
}
