class Program6 {
    public static void main(String[] args) {
        int a = 40, b = 50, c = 70;
        if(a == b && b == c){
            System.out.println("All numbers are equal");
        }
        else if(a>b){
            if(a>c){
                System.out.println(a + " is maximum between "+a+", "+b+" and "+c);
            }
            else if(a == c){
                System.out.println(a + " and " + c +" are maximum between " + a + ", " + b + " and " + c);
            }
            else{
                System.out.println(c + " is maximum between "+a+", "+b+" and "+c);
            }
        }
        else if(b>c){
            if(b == a){
                System.out.println(b + " and " + a +" are maximum between " + a + ", " + b + " and " + c);
            }
            else{
                System.out.println(b + " is maximum between "+a+", "+b+" and "+c);
            }
        }
        else{
            if(c==b){
                System.out.println(c + " and " + b +" are maximum between " + a + ", " + b + " and " + c);
            }
            else{
                System.out.println(c + " is maximum between "+a+", "+b+" and "+c);
            }
        }
    }    
}
