public class pattern_3 {
     static void cases(int n)
    {
         for(int i =1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        for(int i =5;i<=6;i++)
        {
            pattern_3.cases(i);
        }
    }

}
