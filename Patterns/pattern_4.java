public class pattern_4 {
         static void cases(int n)
    {
         for(int i =1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        for(int i =5;i<=6;i++)
        {
            pattern_4.cases(i);
        }
    }
}
