import java.util.Scanner;

class Program9{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {

            int temp = i;
            int facto_sum = 0;
            while(temp!=0){
                int rem = temp%10;
                int facto = 1;
                for (int j = 2; j <= rem; j++) {
                    facto*=j;
                }
                facto_sum += facto;
                temp/=10;
            }
            if(facto_sum == i){
                System.out.print(i+" ");
            }
        }

        sc.close();
    }
}