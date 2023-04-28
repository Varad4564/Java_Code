class Program8 {
    public static void main(String[] args) {
        int n = 9474;
        int temp = n;
        int count = 0;
        for (;temp!=0;temp/=10) {
            count++;
        }
        int store1 = 0;
        temp = n;
        for (;temp!=0;temp/=10) {
            int store2 = 1;
            int rem = temp%10;
            for (int i = 1; i <= count; i++) {
                store2*=rem;
            }
            store1+=store2;
        }
        if(store1 == n){
            System.out.println("Amstrong Number");
        }
        else{
            System.out.println("Not Amstrong Number");
        }
    }    
}