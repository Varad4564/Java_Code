import java.util.Scanner;

class Program1{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= rows ; j++) {
                if(i%2 == 1){
                    System.out.print((char)(65+rows-j)+""+(rows+1-j)+" ");
                }
                else{
                    System.out.print((char)(64+j)+""+(j)+" ");
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}