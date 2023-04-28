import java.util.Scanner;

class Program7{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        int x = (rows*(rows+1))/2;

        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= i ; j++) {
                if((rows-i)%2==0){
                    System.out.print((char)(64+x--)+" ");
                }
                else{
                    System.out.print((x--)+" ");
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}