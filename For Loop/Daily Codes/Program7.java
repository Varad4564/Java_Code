class Program7 {
    public static void main(String[] args) {
        int n = 12;
        int sum = 0;
        int i = 2;
        for (; i*i <= n; i++) {
            if(n%i==0){
                if(i*i!=n){
                    sum+=(n/i);
                }
                sum+=i;
            }
        }
        if(n==sum+1){
            System.out.println("Perfect");
        }
        else{
            System.out.println("Not Perfect");
        }
    }    
}
