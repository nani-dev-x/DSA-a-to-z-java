public class pattern_20 {
    public static void main(String[] args) {
        int n =5;
         int space=n*2;
         int second  =n;
         int stars =0;
        for(int i=0;i<n*2;i++)
        {
            if(i>=n) {second=second-1;stars =second-1;space=space+2;}
             else {space =space-2;stars=i;};
            for(int j =0;j<=stars;j++)
            {
                System.out.print("*");
            }
            for(int s=0;s<space;s++)
            {
                System.out.print(" ");
            }
              for(int j =0;j<=stars;j++)
            {
                System.out.print("*");
            }
          
           System.out.println();
        }
        
    }
}
