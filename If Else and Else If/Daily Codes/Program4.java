class Program4 {
    public static void main(String[] args) {
        int units = 143;

        if(units<=100){
            System.out.println("Electricity bill = "+units+" Rs");
        }
        else{
            System.out.println("Electricity bill = "+(100+(units - 100)*2)+" Rs");
        }
    }    
}
