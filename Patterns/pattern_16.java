public class pattern_16 {
    public static void main(String[] args) {
        int n =5;
        for(int i=0;i<n;i++)
        {
            // char ch  = 'A'+ i; java will not support this
            //  so we use ASCII code
            int m = 65+i;
            char ch = (char) m;
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
