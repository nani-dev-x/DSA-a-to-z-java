public class pattern_10 {
    static void cases(int n)
    { 
       
        for(int i =1;i<=n*2-1;i++)
        {
            int m=i;
            if( i > n){
                   m = 2*n-i;
            }
            for(int j=1;j<=m;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern_10.cases(5);
    }
}
