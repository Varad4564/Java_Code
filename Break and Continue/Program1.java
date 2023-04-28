class Program1 {
    public static void main(String[] args) {
        int n = 25;
        int i = 2;
        for (; i*i <= n; i++) {
            if(n%i==0){
                break;
            }
        }
        if(i*i>n){
            System.out.println("Prime");
        }
        else{
            System.out.println("Non Prime");
        }
    }    
}
