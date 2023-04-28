import java.io.*;

class Program3 {
    public static void main(String[] args) throws IOException {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        // char ch = isr.read();            // The return type of read function is int

        System.out.println("Enter the character: ");
        char ch = (char)isr.read();      // The read function throws IOException and thus we have to throws IOException after the main function (as per the rule of exception handling in java) or else it would have given us error: unreported exception IOException; must be caught or declared to be thrown

        // Read function can only read one character. Even if you enter a string it will only read the first character of it

        System.out.println(ch);        
    
    }
}
