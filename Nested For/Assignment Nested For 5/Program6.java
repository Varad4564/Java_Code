import java.util.Scanner;

class Program6{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter the first character: ");
        char first = sc.next().charAt(0);
        
        System.out.print("Enter the second character: ");
        char second = sc.next().charAt(0);

        if(second == first){
            System.out.println(first);
        }
        else if(second>first){
            System.out.println("the difference between " + first + " and " + second + " is " +(second-first));
        }
        else{
            System.out.println("the difference between " + second + " and " + first + " is " +(first-second));
        }

        sc.close();
    }
}