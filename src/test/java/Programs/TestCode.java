
public class TestCode {


    public static int num_maxEvents (int[] arrival, int[] duration) {

        int len = arrival.length;
        int eventCount = 0;
        int previousDuration = 0;
        int currentDuration = 0;

        for (int i = 0; i <= len - 1; i++) {
            currentDuration = arrival[i];

            if (previousDuration <= currentDuration) {
                eventCount = eventCount + 1;
                previousDuration = arrival[i] + duration[i];
            }
        }
        return eventCount;
    }

    public static void main(String[] args){

        int[] arrival =  {};
        int[] duration = {2,2,1,2,1};
        System.out.println("Event is: " + num_maxEvents(arrival,duration));

        int[] arrival1 =  {1,3,5,6,7,6,9};
        int[] duration1 = {2,2,1,1,2,1,2};
        System.out.println("Event is: " + num_maxEvents(arrival1,duration1));

        int[] arrival2 = {1,3,2,5,8,6,9};
        int[] duration2 = {2,2,1,2,1,10,2};
        int eventCount = num_maxEvents(arrival2,duration2);
        System.out.println("Event is: " + num_maxEvents(arrival2,duration2));

    }
}
