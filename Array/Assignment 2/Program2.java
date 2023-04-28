import java.util.Scanner;

class Program2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int even_count = 0;
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]%2 == 0) {
                even_count++;
            }
        }
        System.out.println("Number of even elements is: "+even_count);
        System.out.println("Number of odd elements is: "+ (arr.length - even_count));
        sc.close();
    }
}