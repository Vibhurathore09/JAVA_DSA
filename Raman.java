import java.util.Scanner;
public class Raman {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt() , n2 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for(int i=0;i<n1;i++)
        {
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<n2;i++)
        {
            arr2[i] = sc.nextInt();
        }
        for(int i=0;i<n1;i++)
        {
            int c=0;
            for(int j=0;j<n2;j++)
            {
                if (arr1[i] <= arr2[j])
                {
                    c++;
                }
            }
            System.out.println(c+" ");
        }
    }
}
