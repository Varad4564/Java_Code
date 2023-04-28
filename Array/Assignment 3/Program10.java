import java.util.Scanner;

class Program10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array 1: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter the elements of the array 1:");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]<min1){
                min2 = min1;
                min1 = arr1[i];  
            }
        }
        if(arr1.length==1){
            System.out.println("There is only one element in the array");
        }
        else if(arr1.length==0){
            System.out.println("There are no elements in the array");
        }
        else{
            System.out.println("The second smallest element in the array is "+min2);
        }
        sc.close();
    }
}