import java.util.*;

public class Program4 {

    static void add(int a, int b){
        System.out.println("The sum of a and b is: "+(a+b));    // We need to specify the addition of the 2 variable in the bracket or else it concatinates the value of the variables in the string and the displays the result
    }

    static void sub(int a, int b){
        System.out.println("The substaraction of a and b is: " + (a - b));      // We need to specify the substraction of 2 variable in brackets or else it fil first concatinate the variable a with the string and then when it sees the "-" operator it gives us an error regarding bad operand type for performing operation  
    }

    static void mult(int a, int b){
        System.out.println("The multiplication of a and b is: "+a*b);
    }
    static void div(int a, int b){
        System.out.println("The division of a and b is: "+a/b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for variable a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value for variable b: ");
        int b = sc.nextInt();

        add(a,b);
        sub(a,b);
        mult(a,b);
        div(a,b);

        sc.close();
    }
}
