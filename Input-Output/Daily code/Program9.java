import java.util.*;
import java.io.*;

public class Program9 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the player info: ");
        String info = br.readLine();

        StringTokenizer st = new StringTokenizer(info);     // The StringTokenizer() method of StringTokenizer class returns the number of tokens which can be generated from the string which is passed for tokanization 

        System.out.println("The number of tokens in the input string are: " + st.countTokens());

        while (st.hasMoreTokens()) {        // The hasMoreTokens() method of StringTokenizer class returns true if there are any possible tokens left in the string which is to be tokanised   
            System.out.println(st.nextToken());
        }
    }
}
