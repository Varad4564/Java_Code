
public class Program2 {
    
    int x = 10;
    static int y = 20;

    void fun(){
        System.out.println("In instance method fun");
    }
    
    static void gun(){
        System.out.println("In static method gun");
    }

    public static void main(String[] args) {

        System.out.println("Static variable y = "+y);
        gun();
        
        Program2 obj = new Program2(); 

        obj.fun();
        System.out.println("Instance variable x = "+obj.x);
        
        // Static variables and methods of a class can also be accessed through the object of that class 

        obj.gun();
        System.out.println("Static variable x = "+obj.y);

    }
}
