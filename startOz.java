//NAME : Grisha Vekariya
//ID NO : 21CE153
//AIM : Given a string, return a string made of the first 2 chars (if present).

import java.util.Scanner;
public class startOz
{
    public static void main(String[] args)
    {
        String s;
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the String:");
        s=obj.nextLine();
        System.out.println("String is:"+s);
        
        
        char index1,index2;
        index1=s.charAt(0);
        index2=s.charAt(1);
        
        if(index1=='o')
        {
            System.out.print("o");
        }
        if(index2=='z')
        {
            System.out.print("z");
        }
        
    }
}

