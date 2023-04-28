class Program5 {
    public static void main(String[] args) {
        int n = 16;
        if(n<=0){
            System.out.println("Invalid Input");
        }
        else{
            int count = 0;
            for (int i = 1; i*i<=n ; i++) {
                if(n%i==0){
                    if(i*i!=n){
                        count++;
                    }
                    count++;
                }
            }
            System.out.println(count);
        }
    }    
}
