import java.util.Scanner;

class Program4{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();

        int i;

        if(end %2==1){
            i = end-1;
        }
        else{
            i = end;
        }
        for (; start <= i ; i-=2) {
            System.out.print(i+" ");
        }
        
        System.out.println("");

        if(start%2==0){
            i = start+1;
        }
        else{
            i = start;
        }
        for (; i <= end ; i+=2) {
            System.out.print(i+" ");
        }

        sc.close();
    }
}