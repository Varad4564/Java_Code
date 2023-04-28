import java.util.Scanner;

class Program5{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        int a = 1;
        int b = 0;

        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(b+" ");
                a = a+b;
                b = a-b;
            }
            System.out.println("");
        }
        sc.close();
    }
}