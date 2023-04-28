import java.util.*;
import java.io.*;

public class Temp3 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the information: ");
        String info = br.readLine();
        StringTokenizer st = new StringTokenizer(info);
        System.out.println(st.nextToken()); 
        System.out.println(st.nextToken()); 
        System.out.println(st.nextToken()); 
    }
}
