import java.io.*;

public class Program6 {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr1 = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(isr1);
        
        br1.close();
        
        // Once we have used the close method on the BufferedReader object then we cannot access the input stream of the process after that 

        // System.out.println("Enter the Grade : ");
        // char grade = (char)br1.read();  
        // System.out.println("The grade is "+grade);
    }
}
