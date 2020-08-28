/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0){
		    int n=sc.nextInt();
		    int M=sc.nextInt();
		    int c=0;
		    ArrayList<Long> al=new ArrayList<Long>();
		    for(int i=0;i<n;i++)
		    {
		        al.add(sc.nextLong());
		        if(al.get(i)==M)
		        {
		            c++;
		        }
		    }
		    Set<Long> set1=new HashSet<>();
		    for(int i=0;i<n;i++)
		    {
		        if(al.get(i)<M)
		        {
		            set1.add(al.get(i));
		        }
		    }
		   
		    if(set1.size()!=M-1){
		        System.out.println(-1);
		    }
		    else{
		        System.out.println(n-c);
		    }
		    
		    
		}
		
	}
}