class Program10 {
    public static void main(String[] args) {
        float fund = 7000.0f;
        if(fund<0f){
            System.out.println("Fund cannot be negative");
        }
        if(fund>=10000f){
            System.out.println("Vacation in Manali");
        }
        else if(fund>=7000f){
            System.out.println("Vacation in MaHabaleshwar");
        }
        else{
            System.out.println("Save the money for next vacation");
        }
    }    
}
