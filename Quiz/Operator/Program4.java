class Program4 {
    static int x = 4;
    public static void main(String[] args) {

        x = (x=4)*(++x);
        // First it assigns the value 4 to the var, after that it performs the increment operation so it gives answer 20
        System.out.println(x);
    }    
}
