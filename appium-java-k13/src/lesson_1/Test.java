package lesson_1;

public class Test {

    public static void main(String[] args) {

        getSmallestAndLargest("welcometojava",3);
    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        if (s.length() < k || k <= 0) {
            // Handle invalid input
            return "Invalid input";
        }

        smallest = s.substring(0, k);
        largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);

            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }

            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }

        System.out.println(smallest+ "\n"+largest);
        System.out.println("Lenght"+s.length());
        return smallest + "\n" + largest;
    }

}
