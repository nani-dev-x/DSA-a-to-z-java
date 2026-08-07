public class pattern_14 {
    public static void main(String[] args) {
        int n =5;
        
        for(int i=0;i<n;i++)
        {
            // for(int j=0;j<=i;j++) // this code will work
            // {    
            //     int number  = 65+j;
            //     char m = (char) number;
            //     System.out.print(m);
            // }
            for(char j='A' ;j<='A'+i;j++) // this also will work
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
