import java.io.*;

class Program5 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What would you like to order? (1. Coffee, 2. Tea, 3. Hot chocolate)");
        int choice = Integer.parseInt(br.readLine());

        switch (choice) {
            case 1:
                System.out.println("You ordered a coffee. That will be 40 Rs.");
                break;
            case 2:
                System.out.println("You ordered a tea. That will be 20 Rs.");
                break;
            case 3:
                System.out.println("You ordered hot chocolate. That will be 70 Rs.");
                break;
            default:
                System.out.println("Sorry, that's not a valid choice.");
                break;
        }
    }
}