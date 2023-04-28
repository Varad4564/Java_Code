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

        for (int i = 0; i < arr1.length; i++) {
            int temp = arr1[i];
            int sum = 0;
            while(temp!=0){
                sum+=temp%10;
                temp/=10;
            }
            if(sum%2==0){
                System.out.print(arr1[i]+" ");
            }
        }

        sc.close();
    }
}

// 2 3 6 8 4 5 8 
// 1 4 5 9 7 3 2 4