class Program10 {
    public static void main(String[] args) {
        int n = 6;
        int j = n;
        for(int i = 1; i<=n;){
            if(j%2==1){
                System.out.print(j+" ");
            }
            else{
                System.out.print((char)(j+64)+" ");
            }
            j--;
            if(j==0){
                i++;
                j = n;
                System.out.println();
            }
        }
    }    
}
