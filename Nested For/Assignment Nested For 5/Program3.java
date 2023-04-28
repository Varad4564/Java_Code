import java.util.Scanner;

class Program3{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= rows+1-i ; j++) {
                System.out.print((rows+1-i)*i-(j-1)*i+" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}