package Programs;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateCharinString {

    @Test
    public void removeDuplicateElementsFromArray(){

        int[] arr = {10,20,20,30,40,50};
        int len = arr.length;
        int[] temp = new int[len];
        int j = 0;

        for (int i = 0; i < len-1; i++) {
            if (arr[i] != arr[i+1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[len-1];

        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
            System.out.println(arr[i]);
        }












    }


}
