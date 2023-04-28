class Program9 {
    public static void main(String[] args) {
        int n = 3;
        int j = 1;
        for(int i = 1; i<=n;){
            System.out.print(j*j+""+(char)(n*i-j+65)+""+(n*i-j+1)+" ");
            j++;
            if(j==n*i+1){
                i++;
                j = n*(i-1)+1;
                System.out.println();
            }
        }
    }    
}
