import java.util.*;
import java.io.*;

public class Program8 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        int roll_No;
        char division;

        System.out.println("Enter the info in the following format: (Name Roll_No Division)");
        String info = br.readLine();
        
        StringTokenizer st = new StringTokenizer(info); 

        name = st.nextToken();
        roll_No = Integer.parseInt(st.nextToken());
        division = st.nextToken().charAt(0);

        System.out.println("The name of the student is "+name);
        System.out.println("The roll number of the student is "+roll_No);
        System.out.println("The division of the student is "+division);
        
    }    
}       
