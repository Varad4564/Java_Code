import java.util.Scanner;

class Program1{
    static int fun(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==1){
                sum+=arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element at position "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        int sum_odd = fun(arr);
        System.out.println("Sum of odd elements is "+sum_odd);
        sc.close();
    }
}