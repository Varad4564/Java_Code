class Program8 {
    public static void main(String[] args) {
        int n = 4;
        int j = 1;
        for(int i = 1; i<=n;){
            if (j%2==1) {
                System.out.print((char)(j+64)+" ");
            }
            else{
                System.out.print((char)(j+96)+" ");
            }
            j++;
            if(j==n*i+1){
                i++;
                j = n*(i-1)+1;
                System.out.println();
            }
        }
    }    
}
