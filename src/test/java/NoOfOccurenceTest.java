import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class NoOfOccurenceTest {

    //***** Traditional For loop Method *****
    @Test
    public void findNoOfOccurenceUsingNormalLoop(){
        int[] inputArr={1,51,6,7,1,164,4,8,2,1,9,1};
        int num=1;
        int Count=0;
        for(int i=0;i<=inputArr.length-1;i++)
        {
            if(inputArr[i]==num)
                Count=Count+1;
        }

        System.out.println("Using Normal For Loop No of Occurence of an element " + num + " is : " + Count);

    }

    //***** Using Lambda Expression ****
    @Test
    public void findNoOfOccurenceUsingLambdaExpression(){
        int num = 1;
        List<Integer> list = Arrays.asList(1, 51, 6, 7, 1, 164, 4, 8, 2, 1, 9, 1);
        long Count = list.stream().filter(n -> n == num).count();
        System.out.println("Using Lambda Expression No of Occurence of an element " + num + " is : " + Count);
    }

}
