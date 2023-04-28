import java.util.Scanner;

class Program5{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {

            int factor_sum = 0;
            for (int j = 1; j < i; j++) {
                if(i%j==0){
                    factor_sum+=j;
                }
            }
            if(factor_sum == i){
                System.out.print(i+" ");
            }
        }

        sc.close();
    }
}