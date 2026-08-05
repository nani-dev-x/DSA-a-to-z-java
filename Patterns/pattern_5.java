class pattern_5
{
        static void cases(int n)
    {
         for(int i =0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        for(int i =5;i<=6;i++)
        {
            pattern_5.cases(i);
        }
    }
}