//NAME : Grisha Vekariya
//ID NO : 21CE153
//AIM : pyramid pattern.

public class Pattern {
    public static void main(String[] args) {
        int x=8;
        int r=1;
        for (int i = x; i > 0; i--)
        {
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= r-1; j++)             
            {
                System.out.print( (int)Math.pow(2, j)+  " ");  
            }
            for (int j = r-1; j >= 1; j--)
            {                    
                System.out.print((int)Math.pow(2, j-1)+" ");
            }                          
            System.out.println();
            r++;
        }
    }
}
