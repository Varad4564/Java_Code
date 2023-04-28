class Program5 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.printf("%-2c    ",j+64);
            }
            System.out.println();
        }
        System.out.println();
    }    
}
