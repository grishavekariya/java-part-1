//NAME : Grisha Vekariya
//ID NO : 21CE153
//AIM : return the number of the positions where they contain the same length 2 substring. 


import java.util.Scanner;
public class stringMatch
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter the first string:");
		s1=sc.next();
		System.out.println("string is:"+s1);
		System.out.println("Enter the second string:");
		s2=sc.next();
		System.out.println("string is:"+s2);
		
		int l1=s1.length();
		int l2=s2.length();
		int l;
		int count=0;
		if(l1<l2){
		    l=l1;
		}
		    else{
		        l=l2;
		    }
		    for(int i=0;i<l-1;i++)
		    {
		        if(s1.charAt(i)==s2.charAt(i))
		        {
		            if(s1.charAt(i+1)==s2.charAt(i+1))
		            {
		                count++;
		            }
		        }
		    }
		   System.out.println(count);     	
	}
}

