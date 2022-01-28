public class SwapTwoNumbers {

    public static void swapTwoNum1(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After  Swap : " + "a = " + a + " ,b = " + b);
    }

    public static void swapTwoNum2(int a, int b){
        a = a * b;
        b = a / b;
        a = a / b;

    }

    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.println("Before Swap : " + "a = " + a + " ,b = " + b);
        swapTwoNum1(a,b);

        System.out.println("Before Swap : " + "a = " + a + " ,b = " + b);
        swapTwoNum2(a,b);


    }
}
