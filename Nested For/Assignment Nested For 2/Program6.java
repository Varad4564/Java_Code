class Program6 {
    public static void main(String[] args) {
        int n = 3;
        int j = 1;
        for(int i = 1; i<=n;){
            System.out.print(j*j+" ");
            j++;
            if(j==n*i+1){
                i++;
                j = n*(i-1)+1;
                System.out.println();
            }
        }
    }    
}
