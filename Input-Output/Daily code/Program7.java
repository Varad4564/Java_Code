import java.io.*;

public class Program7 {

    public static void main(String[] args) throws IOException{
        InputStreamReader isr1 = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(isr1);

        // InputStreamReader isr2 = new InputStreamReader(System.in);
        // BufferedReader br2 = new BufferedReader(isr1);
        
        System.out.println("Enter the Name : ");
        String name = br1.readLine();
        System.out.println("Tne name is "+name);

        br1.close();
        
        // Once we have used the close method on the BufferedReader object then we cannot access the input stream of the process after that even using different object of the BufferedReader closs or InputStreamReader class or Scanner class

        // System.out.println("Enter the Grade : ");
        // char grade = (char)br2.read();  
        // System.out.println("The grade is "+grade);
    }
}
   