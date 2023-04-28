import java.io.*;

class Program4 {
    public static void main(String[] args) throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Enter the Name: ");
        String name = br.readLine();    // The readline function reads the string until it encounters a newline character
        System.out.println("The name is "+name);
        
        System.out.println("Enter the Age: ");
        int age = Integer.parseInt(br.readLine());      // The return type of the readLine function is a string and in order to convert a string into int we need to use the wrapper class Integer because string is a class in java and is not a primitive data type 
        System.out.println("Age is "+age);
        
        br.close();
    }
}
