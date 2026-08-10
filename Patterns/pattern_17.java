public class pattern_17 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++)
        {
            // System.out.print("A");
            for(int j=0;j<n-(i+1);j++)
            {
                System.out.print(" ");
            }
            int count =0;
            int number  = 65;
            for(char ch ='A';ch<'A'+2*i+1;ch++)
            {
                if(count >= i+1)
                {
                    number--;
                    char che = (char) (number-1);
                    System.out.print(che); 
                }
                else{
                    System.out.print(ch);
                    number++;
                }
                count++;
            }
             for(int j=0;j<n-(i+1);j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
