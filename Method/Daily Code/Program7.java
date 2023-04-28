public class Program7 {
    
    int fun(int x){
        return x+10;
    }

    void gun(int x){
        int y = x+10;
        System.out.println(y);
    }

    public static void main(String[] args) {
        Program7 obj = new Program7();
        
        System.out.println(obj.fun(10));

        // System.out.println(obj.gun(10));    //This would give us error because the method which returns void is not printable
    
        // int a = obj.gun(10);     // This would give us error because void data type cannot be stored in an int variable
        // System.out.println(a);
    }
}