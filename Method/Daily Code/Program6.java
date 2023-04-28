public class Program6 {

    void fun(){
        System.out.println("In Fun");
    }

    void gun(int x){
        System.out.println("The parameter passed is: "+x);
    }

    void func(float x){
        System.out.println("In fun");
        System.out.println(x);
    }

    public static void main(String[] args) {
        Program6 obj = new Program6();

        obj.func(10);
        obj.func(10.5f);
        obj.func('A');

        // obj.func(10.5);      // This would give us error because converting double to float is a lossy conversion
        
        // In bot the below examples the expected input arguments length and actual arguments length varies hence it gives us error 

        // obj.gun();      
        // obj.fun(10);
    }
}
