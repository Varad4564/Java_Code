class Program6 {
    public static void main(String[] args) {
        int b = 10;
        System.out.println(b+(b = 3));
        // Due to precedence 10 value of b is considered first and then the assignment operation returns the value which is stored in the variable
    }    
}
