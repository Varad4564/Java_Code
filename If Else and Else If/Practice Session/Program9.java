class Program9 {
    public static void main(String[] args) {
        int a = 5,b = 3,c = 5;
        if(a == 0 || b == 0 || c == 0){
            System.out.println("");
        }
        else if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b){
            System.out.println("It is a Pythagorean Tripelet");
        }
        else{
            System.out.println("It is not a Pythagorean Tripelet");
        }
    }    
}
