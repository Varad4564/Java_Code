class Program9 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // System.out.println(x && y);      This would yield an error because the logical operator is only applicable on boolean values
        
        System.out.println(x<y && y>x);      
    }    
}
