import java.util.Scanner;

class Program9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array 1: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter the elements of the array 1:");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]>max1){
                max2 = max1;
                max1 = arr1[i];  
            }
        }
        if(arr1.length==1){
            System.out.println("There is only one element in the array");
        }
        else if(arr1.length==0){
            System.out.println("There are no elements in the array");
        }
        else{
            System.out.println("The second largest element in the array is "+max2);
        }
        sc.close();
    }
}