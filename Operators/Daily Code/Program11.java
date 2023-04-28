class Program11 {
    public static void main(String[] args) {
        int x = 5;      // 0000 0101
        int y = 7;      // 0000 0111

        System.out.println(x&y);    // 0000 0101
        System.out.println(x|y);    // 0000 0111
        System.out.println(x^y);    // 0000 0010
    }    
}
