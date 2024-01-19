package lab3;

public class Lab3_1 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5,9};
        int evenNumber=0;int oddNumber=0;
        for (int i : intArr) {
            if (i % 2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
        }
        System.out.println("Total even number:"+evenNumber);
        System.out.println("Total odd number:"+oddNumber);

    }
}
