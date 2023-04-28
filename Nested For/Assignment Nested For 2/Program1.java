class Program1{
    public static void main(String[] args) {
        int n = 3;
        int j = 1;
        for (int i = 1; i <= n; ) {
            System.out.print("C2W"+(j++)+" ");
            if(j==n+1){
                j=1;
                i++;
                System.out.println();
            }
        }
    }
}