class Program7 {
    public static void main(String[] args) {
        int n = 3;
        int j = 1;
        for(int i = 1; i<=n;){
            if ((j+i)%2==0) {
                System.out.print(j*j+" ");
            }
            else{
                System.out.print(j+" ");
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
