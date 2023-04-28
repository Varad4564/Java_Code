class Program6 {
    public static void main(String[] args) {
        int n = 14;
        int i;
        for (i = 2; i*i < n; i++) {
            if (n%i==0) {
                break;
            }
        }
        if(i*i<=n) {
            System.out.println("Non Prime");
        }
        else{
            System.out.println("Prime");
        }
    }    
}
