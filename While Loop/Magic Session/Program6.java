class Program6 {
    public static void main(String[] args) {
        int n = 10;
        int even_sum = (n/2)*((n/2)+1);
        int odd_mult = 1;
        int i = 1;
        while(i<=n){
            odd_mult*=i;
            i+=2;
        }
        if(n<=0){
            System.out.println("Even sum = "+ 0);
            System.out.println("Odd mult = "+ 0);
        }
        else{
            System.out.println("Even sum = "+ even_sum);
            System.out.println("Odd mult = "+ odd_mult);
        }
    }    
}
