import java.util.Scanner;



class Program4{
    static void fun(char arr[]){
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 'A':
                    System.out.print("A ");
                    break;
                case 'E':
                    System.out.print("E ");
                    break;
                case 'I':
                    System.out.print("I ");
                    break;
                case 'O':
                    System.out.print("O ");
                    break;
                case 'U':
                    System.out.print("U ");
                    break;
                case 'a':
                    System.out.print("a ");
                    break;
                case 'e':
                    System.out.print("e ");
                    break;
                case 'i':
                    System.out.print("i ");
                    break;
                case 'o':
                    System.out.print("o ");
                    break;
                case 'u':
                    System.out.print("u ");
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[] = new char[7];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the character element at position "+(i+1)+": ");
            arr[i] = sc.next().charAt(0);
        }
        fun(arr);
        sc.close();
    }
}