import java.util.Scanner;

class Program4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the elements you want to search");
        int ele = sc.nextInt();
        int i;
        for(i = 0; i < arr.length; i++){
            if(arr[i] == ele){
                System.out.println("Index = "+i);
                break;
            }
        }
        if(i==arr.length){
            System.out.println("The element is not present in the array");
        }
        sc.close();
    }
}