public class Program3 {

    int x = 10;
    static int y = 20;

    void fun(){
        System.out.println("Instance variable x = "+x);
        System.out.println("Static variable y = "+y);
        gun();
    }
    
    static void gun(){
        System.out.println("In Static method");
        System.out.println("Static variable y = "+y);

        // System.out.println(obj.x);   // This would give us error because even though obj reference variable holds the object of class but its scope is limited to the main function where it is declared   
    }
    public static void main(String[] args) {
        Program3 obj = new Program3(); 
        obj.fun(); 
    }
}
