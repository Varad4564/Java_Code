import java.io.*;

class Program2 {
    public static void main(String[] args) throws IOException {
        int num;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
       
        System.out.print("Enter the number: ");
        num = Integer.parseInt(br.readLine()); 
        
        if(num<0){
            System.out.println("Invalid input");
        }
        else{
            switch(num){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                default:
                    System.out.println("Number is greater than 5");
                    break;
            }
        }
    }    
}
