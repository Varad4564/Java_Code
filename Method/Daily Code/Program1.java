class Program1{
    int x = 10;
    static int y = 20;

    // static void fun();   // This would give us error. There is no explicit function declaration in java like C
    public static void main(String[] args) {
        
        System.out.println(y);
        fun();
        
        // non static methods and variables cannot be referenced from static context 

        // System.out.println(x);
        // gun();

        // In java the methods are aloowed to be defined below the main function

    }
    static void fun(){
        System.out.println("In fun");
    }
    
    void gun(){
        System.out.println("In gun");
    }
}