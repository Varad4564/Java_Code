import java.util.Scanner;

class Program6{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        int n = 5;
        System.out.println("Enter 5 numbers ");
        System.out.println("");
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number "+i+": ");
            int num = sc.nextInt();
            if(num!=0){
                int temp = num;
                int digit_count = 0;
                while(temp!=0){
                    digit_count++;
                    temp/=10;
                }
                System.out.println("The digit count in "+num+" is "+digit_count);
            }
            else{
                System.out.println("The digit count in "+num+" is 1");
            }
        }

        sc.close();
    }
}