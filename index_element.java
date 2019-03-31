import java.util.Scanner;
public class Program
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the k th position:");
        int k = s.nextInt();
        System.out.println("Number:"+a[k-1]);
    }
}
