//Meeting Rooms
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
        boolean canAttend=true;
        List<int[]> result=new ArrayList<>();
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<=intervals[i-1][1])
            {
                canAttend=false;
                break;
            }
        }
        System.out.println(canAttend);
    }
}
   
