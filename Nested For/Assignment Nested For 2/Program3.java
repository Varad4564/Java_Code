class Program3 {
    public static void main(String[] args) {
        int n = 4;
        int j = 1;
        for (int i = 1; i <= n; ) {
            System.out.print(n+i+(j++)+8+" ");
            if(j==n+1){
                j = 1;
                i++;
                System.out.println();
            }
        }
    }    
}
