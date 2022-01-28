public class StringReverse {

    public static String ReverseUsingtoCharArray(String str){
        char[] strArr = str.toCharArray();
        int len = strArr.length;
        String strReverse="";

        for (int i=len-1; i>=0; i--){
            strReverse = strReverse + strArr[i];
        }
        return strReverse;

    }

    public static String ReverseUsingCharAt(String str){
        int len = str.length();
        String strReverse="";

        for (int i=len-1; i>=0; i--){
            strReverse = strReverse + str.charAt(i);
        }
        return strReverse;

    }





    public static void main(String[] args) {

        System.out.println("Reverse of String is " + ReverseUsingtoCharArray("Shubham"));
        System.out.println("Reverse of String is " + ReverseUsingCharAt("Patel"));

    }


}
