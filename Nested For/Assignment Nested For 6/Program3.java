import java.util.Scanner;

class Program3{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();

        int j = 1;
        for (; j*j < start; j++);
        for (int i = start; i <= end; i++) {

            if(j*j==i){
                System.out.print(i+" ");
                j++;
            }
            
        }

        sc.close();
    }
}