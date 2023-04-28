class Program12 {
    public static void main(String[] args) {
        int n = 145;
        if(n>=0){
            if(n!= 0){
                int temp = n;
                int sum = 0;
                for (;temp!=0;temp/=10) {
                    int rem = temp%10;
                    int facto = 1;
                    for (;rem>1;facto*=rem,rem--);
                    // In the above statement "facto*=rem" is executing first and then "rem--" is getting executed
                    sum+=facto;
                }
                if (sum == n) {
                    System.out.println(n+" is a strong number");
                }
                else{
                    System.out.println(n+" is not a strong number");
                }
            }
            else{
                System.out.println(n+" is not a strong number");
            }
        }  
        else{
            System.out.println("Invalid Input");
        }
    }    
}
