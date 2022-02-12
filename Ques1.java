
import java.util.Scanner;

public class Ques1
{
    Node head;
    int tos;
    int stack[];

    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    Ques1(int data)
    {
        tos = -1;
        stack = new int[data];
    }
    public boolean isempty()
    {
        if(tos==-1)
        {
            return true;
        }
        return false;
    }
    public boolean isfull()
    {
        return tos== stack.length-1;
    }
    public void push(int data){
        if(isfull())
            System.out.println("Overflow");
        else
            stack[++tos]=data;
    }
    public void pop()
    {
        if(isempty())
            System.out.println("UnderFlow");
        else
            System.out.println(stack[tos--]+" ");
    }
    public void Insert(Node head, int x)
    {
        Node q = head;
        Node n = new Node(x);
        q.next = n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of matrix r rows and c colummn");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int sumc[] = new int[c];
        int arr[][] = new int[r][c];
        for (int i = 0; i <r ; i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <c ; i++)
        {
            sumc[i]=0;
            for(int j=0;j<r;j++)
            {
                sumc[i]=sumc[i]+arr[j][i];
                //System.out.println(arr[j][i]);
            }
        }
        for(int i=0;i<c;i++)
        {
            System.out.print(sumc[i]+" ");
        }
        Ques1 l = new Ques1(c);
        System.out.println();
        l.head = new Node(sumc[0]);
        Node n = l.head;
        int i=1;
        while( i<c )
        {
            l.Insert(n,sumc[i]);
            n=n.next;
            i++;
        }
        Node p = l.head;
        System.out.println("Printing list");
        while(p!=null)
        {
            System.out.print(p.data+" ");
            p=p.next;
        }
        Node a = l.head;
        while(l.head!=null){
            l.push(l.head.data);
            l.head=l.head.next;
        }
        int count=0;
        System.out.println();
        while(count<c) {
            l.pop();
            count++;
        }
    }


}
