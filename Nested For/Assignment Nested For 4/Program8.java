class Program8 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(i%2==0){
                    System.out.print((char)(n*(n+1)/2-(i*(i-1)/2+j)+65)+" ");
                }
                else{
                    System.out.print(n*(n+1)/2-(i*(i-1)/2+j)+1+" ");
                }
            }
            System.out.println();
        }
    }    
}
