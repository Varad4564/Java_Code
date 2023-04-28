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
        System.out.print("Enter the size of the array 2: ");

        n = sc.nextInt();
        int arr2[] = new int[n];
        System.out.println("Enter the elements of the array 2");
        
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        n = arr1.length + arr2.length;
        System.out.print("Merged array = ");
        int arr3[] = new int[n];
        for (int i = 0; i < arr3.length; i++) {
            if(i<arr1.length){
                arr3[i] = arr1[i];
                System.out.print(arr3[i]+" ");
            }
            else{
                arr3[i] = arr2[i-arr1.length];
                System.out.print(arr3[i]+" ");    
            }
        }
        sc.close();
    }
}

// 2 3 6 8 4 5 8 
// 1 4 5 9 7 3 2 4