//NAME : Grisha Vekariya
//ID NO : 21CE153
//AIM : return true if they have the same last digit.


import java.util.Scanner;
public class lastDigit
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the first no:");
        a=obj.nextInt();
        System.out.println("first no is:"+a);

        System.out.println("Enter the second no:");
        b=obj.nextInt();
        System.out.println("second no is:"+b);
    
        if(a%10==b%10)
        {
                System.out.println("true");
        }
            else 
            {
                System.out.println("false");
            }
        }
 }
