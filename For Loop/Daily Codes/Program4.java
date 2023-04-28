class Program4 {
    public static void main(String[] args) {
        int n = 9;
        if(n<=0){
            System.out.println("Invalid Input");
        }
        else{
            for (int i = 1; i*i<=n ; i++) {
                if(n%i==0){
                    if(i*i!=n){
                        System.out.println(n/i);
                    }
                    System.out.println(i);
                }
            }
        }
    }    
}
