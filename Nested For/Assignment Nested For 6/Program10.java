import java.util.Scanner;

class Program10{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {

            int temp = i;
            int exp = 0;
            while(temp!=0){
                exp++;
                temp/=10;
            }
            int power_sum = 0;
            temp = i;
            while(temp!=0){
                int rem = temp%10;
                int power = 1;
                for(int j = 1; j <= exp; j++){
                    power *= rem;
                }
                power_sum += power;
                temp/=10;
            }
            if(power_sum == i){
                System.out.print(i+" ");
            }
        }

        sc.close();
    }
}