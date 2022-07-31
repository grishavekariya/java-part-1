//NAME : Grisha Vekariya
//ID NO : 21CE153
//AIM : multiple-choice tests.

import java.util.Scanner;
public class Test{
    public static void main(String args[])
    {
    Scanner s= new Scanner(System.in);
    String  arr[][]=new String[8][10];
    String key[]={"D","B","D","C","C","D","A","E","A","D"};
    for (int i = 0; i < 8; i++) {
        System.out.println("Student "+(i+1));
        int count=0;
        for (int j = 0; j < 10; j++) {
            arr[i][j]= s.next();
            if(arr[i][j].equals(key[j]))
            {
                count++;
            }
        }
        System.out.println("COUTN:"+count);
    }
    }
}
