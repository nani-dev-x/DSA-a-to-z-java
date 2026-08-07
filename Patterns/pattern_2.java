class pattern_2
{
    static void cases(int n)
    {
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<i+1;j++) // j<=i
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // outer loop length
        pattern_2.cases(5);

    }
}