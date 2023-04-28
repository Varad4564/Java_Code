class Program4 {
    public static void main(String[] args) {
        int n = 3;
        int j = 1;
        for (int i = 1; i <= n; ){
            System.out.print(j+""+(char)(64+j)+" ");
            j++;
            if(j == n+1){
                j = 1;
                i++;
                System.out.println();
            }
        }
    }    
}
