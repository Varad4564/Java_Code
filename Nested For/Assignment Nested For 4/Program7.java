class Program7 {
    public static void main(String[] args) {
        int n = 6;
        int x = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(j%2==1){
                    System.out.print((char)(65+n-i+j/2)+" ");
                }
                else{
                    System.out.print(x++ +" ");
                }
            }
            System.out.println();
        }
    }    
}
