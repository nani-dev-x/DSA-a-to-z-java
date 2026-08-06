public class pattern_9 {
    static void cases(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<n*2-(2*i+1);k++)
            {
                System.out.print("*");
            }
             for(int l=0;l<i;l++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern_7.cases(5);
        pattern_8.cases(5);
    }
}
