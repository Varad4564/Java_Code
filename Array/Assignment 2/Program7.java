import java.util.Scanner;

class Program7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array 1: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr3[] = new int[n];
        System.out.println("Enter the elements of the array 1");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the array 2: ");
        n = sc.nextInt();
        int arr2[] = new int[n];
        int arr4[] = new int[n];
        System.out.println("Enter the elements of the array 2");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr4[j] == 0 && arr2[j] == arr1[i]){
                    if(arr3[i] == 0){
                        System.out.println(arr1[i]);
                        arr3[i] = 1;
                    }
                    arr4[j] = 1;
                }
            }
        }

        sc.close();
    }
}

// 2 3 6 8 4 5 8 
// 1 4 5 9 7 3 2 4