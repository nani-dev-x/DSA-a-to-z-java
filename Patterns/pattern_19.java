public class pattern_19 {
    public static void main(String[] args) {
        int n =5;
        int space=0;
        for(int i=0;i<n*2;i++)
        {
            
            if(i <5)
            {
            space =2*i;
            for(int j =0;j<n-i;j++)
            {
                System.out.print("*");
            }
            for(int s=0;s<space;s++)
            {
                System.out.print(" ");
            }
              for(int j =0;j<n-i;j++)
            {
                System.out.print("*");
            }
           }
           else
           {
             for(int j=0;j<=i-n;j++)
             {
                System.out.print("*");
             }
             for(int s=0;s<space;s++)
            {
                System.out.print(" ");
            }
            space = space-2;
             for(int j=0;j<=i-n;j++)
             {
                System.out.print("*");
             }
           }
           System.out.println();
        }
    }
}
