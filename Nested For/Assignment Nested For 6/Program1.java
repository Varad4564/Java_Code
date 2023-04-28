import java.util.Scanner;

class Program1{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if(i%5 == 0 && i%2 == 0){
                System.out.print(i+" ");
            }
        }

        sc.close();
    }
}