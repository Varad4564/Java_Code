import java.util.Scanner;

class Program2{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            int j = 2;
            for (; j*j <= i; j++) {
                if(i%j==0){
                    System.out.print(i+" ");
                    break;
                }
            }
        }

        sc.close();
    }
}