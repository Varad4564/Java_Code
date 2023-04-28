import java.io.*;


class Program5 {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the Name of the appartments: ");
        String name = br.readLine();    // The readline function reads the string until it encounters a newline character
        System.out.println("The name of the appartments is "+name);
        
        System.out.println("Enter the wing: ");
        char ch = (char)br.read();
        System.out.println("Tne wing is "+ch);
        
        br.skip(2);    // This statment is written to catch the \r\n left in the input buffer after the caracter is entered. The number of bytes to skip is passed a parameter to the skip function 
        
        // In windows the \r\n is left in the input bufer after we hit the "Enter" button therefore we have specified 2 as a parameter in the skip function, where as inlinux \n is left in the input bufer after we hit the "Enter" button
        
        System.out.println("Enter the flat number: ");
        int flat_no = Integer.parseInt(br.readLine());  // The return type of the readLine function is a tring and in order to convert a string into int we need to use the wrapper class Integer because string is a class in java and is not a primitive data type 
        System.out.println("Flat number is "+flat_no);
        
        br.close();
    }    
}
