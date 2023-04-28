import java.io.*;

class Program3 {
    public static void main(String[] args) throws IOException {
        int num1, num2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
       
        System.out.print("Enter the number 1: ");
        num1 = Integer.parseInt(br.readLine()); 
        
        System.out.print("Enter the number 2: ");
        num2 = Integer.parseInt(br.readLine()); 

        if(num1<0||num2<0){
            System.out.println("Sorry negetive numbers not allowed");
        }
        else{
            switch ((num1*num2)%2) {
                case 1:
                    System.out.println("Multiplication is odd");
                    break;    
                default:
                    System.out.println("Multiplication is even");
                    break;
            }
        }
    }
}