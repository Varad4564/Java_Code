import java.util.Scanner;

class Program3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int even_sum = 0;
        int odd_sum = 0;
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]%2 == 0) {
                even_sum+=arr[i];
            }
            else{
                odd_sum+=arr[i];
            }
        }
        System.out.println("Sum of even elements is: "+even_sum);
        System.out.println("Sum of odd elements is: "+ odd_sum);
        sc.close();
    }
}