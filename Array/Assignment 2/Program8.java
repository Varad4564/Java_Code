import java.util.Scanner;

class Program8{
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
        
        for (int i = 0; i < arr1.length-1; i++) {
            if(arr3[i] == 0){
                for (int j = i+1; j < arr1.length; j++) {
                    if(arr1[i] == arr1[j]){
                        arr3[j] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < arr2.length-1; i++) {
            if(arr4[i] == 0){
                for (int j = i+1; j < arr2.length; j++) {
                    if(arr2[i] == arr2[j]){
                        arr4[j] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < arr3.length-1; i++) {
            if(arr3[i] == 0){
                int j;
                for (j = 0; j < arr2.length; j++) {
                    if(arr1[i] == arr2[j]){
                        arr4[j] = 1;
                        break;
                    }
                }
                if(j == arr2.length){
                    System.out.println(" " + arr1[i]);
                }
            }
        }
        
        for(int i = 0; i < arr2.length; i++){
            if(arr4[i] == 0){
                System.out.println("for i = " + i +" arr2[i] = " + arr2[i]);
            }
        }

        sc.close();
    }
}

// 2 3 6 8 4 5 8 
// 1 4 5 9 7 3 2 4