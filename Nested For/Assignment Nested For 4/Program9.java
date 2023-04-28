class Program9 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= 2*i-1; j++) {
                if((i+j)%2==1){
                    System.out.print(j*j+" ");
                }
                else{
                    System.out.print(j*j*j+" ");
                }
            }
            System.out.println();
        }
    }    
}
