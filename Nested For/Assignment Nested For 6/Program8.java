import java.util.Scanner;

class Program8{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {

            int temp = i;
            int rev = 0;
            while(temp!=0){
                int rem = temp%10;
                rev = rev*10 + rem;
                temp/=10;
            }
            if(rev == i){
                System.out.print(rev+" ");
            }
        }

        sc.close();
    }
}