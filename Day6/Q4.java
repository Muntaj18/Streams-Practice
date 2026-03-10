//Meeting Rooms II
import java.util.*;
public class Main{
    public static void  main(String[] args)
    {
        int[][] intervals={
        {0,30},
                {5,10},
                {15,20}
        };
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        PriorityQueue<Integer> result=new PriorityQueue<>();
        result.add(intervals[0][1]);
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]>=result.peek())
            {
                result.poll();
            }
            result.add(intervals[i][1]);
        }
        System.out.println(result.size());
        
    }
}
   
