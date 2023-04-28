class Program2 {
    public static void main(String[] args) {
        int n = 4;
        int j = 1;
        for(int i = 1; i<=n; ){
            System.out.print(n-1+i+" ");
            j++;
            if(j==n+1){
                j=1;
                i++;
                System.out.println();
            }
        }
    }    
}
