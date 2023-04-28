class Program4 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.printf("%-2d    ",j);
            }
            System.out.println();
        }
        System.out.println();
    }    
}
