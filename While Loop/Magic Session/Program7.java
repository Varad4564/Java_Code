class Program7 {
    public static void main(String[] args) {
        int n = 17;
        if(n<=0){
            System.out.println();
        }
        else if(n%2==0){
            while (n>0) {
                System.out.println(n--);
            }
        }
        else{
            while (n>0) {
                System.out.println(n);
                n-=2;
            }
        }
    }
}