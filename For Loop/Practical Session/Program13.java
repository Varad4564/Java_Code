class Program13 {
    public static void main(String[] args) {
        int prev = 0;
        int next = 1;
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.println(prev);
            next = next + prev;
            prev = next - prev; 
        }
    }    
}
