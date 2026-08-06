public class pattern_10 {
    static void cases(int n)
    { for(int i =0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern_2.cases(5);
        pattern_10.cases(5);
    }
}
