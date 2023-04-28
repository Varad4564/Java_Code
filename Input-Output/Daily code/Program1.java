import java.util.Scanner;    

/*  If we would have not included the above line, then we would have encountered 2 errors for Scanner class referece and scanner class object. The reason for giving 2 error (one for reference and other for the object) is that, in java the reference of the parent class can hold the object of its child class */

class Program1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String name = sc.next();    // The next function reads the string until it encounters a non printable character (tab, white space, etc)  
        System.out.println("The name is "+name);
        
        name = sc.nextLine();    // The nextline function catches the \n which is left in the input buffer. If we would have used sc.next() method instead of sc.nextLine() method then it would have ignored the \n which is left in the input buffer and waited for the user to enter some string. But the drawback of sc.next() function is that it only reads the string until it encounters a non printable character (tab, white space, etc)  
        
        System.out.println("Enter your full name:");
        name = sc.nextLine();    // The next function reads the string until it encounters a nextline character. Even if we write a sc.nextLine() statment after this statement then it will wait for the user to give the input because probably the nextLine function either removes the \n form the input buffer or moves the pointer ahead of the \n in the input buffer so that the nextLine() function can value from the user   
        System.out.println("The name is "+name);
        sc.close();
    }
}