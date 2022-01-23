import java.util.Arrays;
import java.util.Scanner;

public class Students {
    String name;
    int marks;
    Students(int marks , String name)
    {
        this.name = name;
        this.marks = marks;
    }
    public static int highest_marks(Students arr[])
    {
        int high[]= new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            high[i] = arr[i].marks;

        }
        Arrays.sort(high);
        return high[arr.length-1];
    }
    public static int lowest_marks(Students arr[])
    {
        int low[]= new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            low[i] = arr[i].marks;

        }
        Arrays.sort(low);
        return low[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students arr[] = new Students[5];
        for(int i=0;i<5;i++)
        {
            arr[i] = new Students(sc.nextInt(),sc.next());
        }
        int high = Students.highest_marks(arr);
        int low = Students.lowest_marks(arr);
        System.out.println("Highest marks "+high);
        System.out.println("Lowest Marks "+low);
    }
}
