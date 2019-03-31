import java.util.*;
 
public class Median 
{
    static int N = 10, M = 5;
    static int[] s1 = new int[N];
    static int[] s2 = new int[M];
    static int[] s = new int[N+M];
 
    public static void sort() 
    {
        int i, j, temp;
        for (i = 1; i < N+M; i++) 
        {
            j = i;
            temp = s[i];
            while (j > 0 && temp < s[j - 1]) 
            {
                s[j] = s[j - 1];
                j = j - 1;
            }
            s[j] = temp;
        }
    }
 
    public static void main(String args[])
    {
        Random random = new Random();
 
        for(int i=0; i<N; i++)
            s1[i] = Math.abs(random.nextInt(100));
        for(int i=0; i<M; i++)
            s2[i] = Math.abs(random.nextInt(100));
        for(int i=0; i<N; i++)
            System.out.print(s1[i] + " ");
        System.out.println();
 
        for(int i=0; i<M; i++)
            System.out.print(s2[i] + " ");
        System.out.println();
 
 
        int j=0;
        for(int i=0; i<N+M; i++)
        {
            if(i >= N && j < M)
                s[i] = s2[j++];
            else
                s[i] = s1[i];
        }
 
        sort();
 
        if(N+M % 2 == 0)
            System.out.println("The Median is : " + (s[(N+M)/2-1]+s[(N+M)/2])/2);
        else
            System.out.println("The Median is : " + s[(N+M)/2]);
    }
}
