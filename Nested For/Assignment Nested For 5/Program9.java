import java.util.Scanner;

class Program9{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int temp = num;
        int facto_sum = 0;
        while(temp!=0){
            int rem = temp%10;
            int facto = 1;
            for(int i = 2; i<= rem; i++){
                facto *= i; 
            }
            facto_sum += facto; 
            temp/=10;
        }
        System.out.println("Addition of factorilas from each digit from "+ num + " is " + facto_sum);
        sc.close();
    }
}