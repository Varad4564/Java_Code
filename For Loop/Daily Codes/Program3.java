class Program3 {
    public static void main(String[] args) {
        int n = 6;
        int facto = 1;
        if(n<0){
            System.out.println("Invalid Input");
        }
        else if(n==1 || n==0){
            System.out.println("Factorial = 1");
        }
        else{
            for (;n!=1;n--) {
                facto*=n;
            }
            System.out.println("Factorial = "+facto);
        }
    }    
}
