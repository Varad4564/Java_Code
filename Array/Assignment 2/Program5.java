import java.util.Scanner;

class Program5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int min = 0;
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(i == 0){
                min = arr[i];
            }
            else{
                if(min>arr[i]){
                    min = arr[i];
                }
            }
        }
        System.out.println("The minimum elements is: "+min);
        sc.close();
    }
}