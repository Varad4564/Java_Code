import java.util.Scanner;

public class Program5 {

    static void digit_sum(long n){
        int sum = 0;

        for(;n!=0;n/=10){
            
            sum += n%10;
            
            // sum = sum + n%10;    // If we would have used the following operation then it would have given us the error related to possible loosy conversion from long to int 

        }

        System.out.println("The sum of the digits of the input number is: "+sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        long n = sc.nextLong();

        digit_sum(n);

        sc.close();
    }
}
