import java.util.Scanner;

class Program8{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= i ; j++) {
                if(i%4 == 1){
                    System.out.print("$ ");
                }
                else if(i%4 == 2){
                    System.out.print("@ ");
                }
                else if(i%4 == 3){
                    System.out.print("& ");
                }
                else {
                    System.out.print("# ");
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}