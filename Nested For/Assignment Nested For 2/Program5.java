class Program5 {
    public static void main(String[] args) {
        int n = 4;
        int j = 1;
        char ch = 'Z';
        int k = 26; 
        for (int i = 1; i <= n; ){
            if (j%2==1) {
                System.out.print(k-- +" ");
            }
            else{
                System.out.print(ch-- +" ");
            }
            j++;
            if(j == n+1){
                j = 1;
                i++;
                System.out.println();
            }
        }
    }    
}
