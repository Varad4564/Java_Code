import java.util.Scanner;

class Program2{
    static int fun(int arr[]){
        int prod = 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                prod*=arr[i];
            }
        }
        return prod;
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
        int prod = fun(arr);
        System.out.println("product of even elements is "+prod);
        sc.close();
    }
} 
