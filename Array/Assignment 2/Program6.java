import java.util.Scanner;

class Program6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max = 0;
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(i == 0){
                max = arr[i];
            }
            else{
                if(max<arr[i]){
                    max = arr[i];
                }
            }
        }
        System.out.println("The maximum elements is: "+max);
        sc.close();
    }
}