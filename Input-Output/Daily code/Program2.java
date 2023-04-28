import java.util.Scanner;

class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String name = sc.nextLine();
        System.out.println("Name is "+name);
        // System.out.println("Enter the Age: ");

        // String age = sc.nextInt();       // This line will give us error even if we are trying to store a lower data type value in a higher data type variable.
        
        sc.close();
    }    
}
