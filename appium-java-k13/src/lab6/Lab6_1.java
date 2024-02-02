package lab6;

public class Lab6_1 {
    public static void main(String[] args) {
        String str = "12hrs and 0 minutes";
        System.out.println("Total min of string after calculate\n"+totalMin(str));
        }
        public static int totalMin(String str){
            String strHr = str.replaceAll("\\D+","");
            int total = Integer.parseInt(strHr);
            int Hr = total/10;
            int min = total%10;
            return Hr*60+min;
        }
    }

