class Program11 {
    public static void main(String[] args) {
        int n = 76;
        if(n>=0){
            int temp = n;
            int mult = 1;
            for(;temp!=0;temp/=10){
                mult*=10;
            }
            if((n*n)%mult == n){
                System.out.println("Auto-morphous Number");
            }
            else{
                System.out.println("Non Auto-morphous Number");
            }
        }  
        else{
            System.out.println("Invalid Input");
        } 
    }
}
