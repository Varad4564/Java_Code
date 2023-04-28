import java.io.*;

class Temp {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr1 = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(isr1);
                
        System.out.println("Enter the Name : "); 
        String name = br1.readLine();   
        System.out.println("The name is "+name);
        
        br1.close();
        
        InputStreamReader isr2 = new InputStreamReader(System.in); 
        BufferedReader br2 = new BufferedReader(isr2);
        
        System.out.println("Enter the Team : ");  
        String team = br2.readLine();    
        System.out.println("The name is "+team);

    }    
}
