class Program2 {
    public static void main(String[] args) {
        int n = 4;
        int facto = 1;
        while (n!=1) {
            facto*=n;
            n--;
        }
        System.out.println(facto);
    }    
}
