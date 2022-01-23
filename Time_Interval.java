import java.sql.Time;
import java.util.Arrays;
import java.util.Scanner;

public class Time_Interval {
    int start;
    int end;
    Time_Interval(int start, int end)
    {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of departments");
        int n = sc.nextInt();

        Time_Interval arr[] = new Time_Interval[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter timing for");
            arr[i]=new Time_Interval(sc.nextInt(),sc.nextInt());
        }
        System.out.println(Time_Interval.canAttendMeeting(arr));

    }
    public static boolean canAttendMeeting(Time_Interval [] arr)
    {
        boolean b = true;
        int start[] = new int[arr.length];
        int end[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            start[i] = arr[i].start;
            end[i] = arr[i].end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        for(int i=0;i<start.length-1;i++)
        {
            if(start[i+1]>=end[i])
            {
                b = true;
            }
            else{
                b = false;
            }
        }

        return b;
    }
}
