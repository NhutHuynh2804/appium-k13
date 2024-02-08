package lab6;

public class Lab6_1 {
    public static void main(String[] args) {
        String str = "10hrs and 10 minutes";
        System.out.println("Total min of string after calculate\n"+totalMin(str));
        }
        public static int totalMin(String str){

            String [] part = str.split("\\D+");
            int hr = Integer.parseInt(part[0]);
            int min = Integer.parseInt(part[1]);
            return hr*60+min;
        }
    }

