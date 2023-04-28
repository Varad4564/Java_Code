class Program7 {
    public static void main(String[] args) {
        int Selling_Price = 1200;
        int Cost_Price = 1800;

        if(Selling_Price>Cost_Price){
            System.out.println("Profit is "+(Selling_Price-Cost_Price));
        }
        else if(Selling_Price<Cost_Price){
            System.out.println("Loss is "+(Cost_Price-Selling_Price));
        }
        else{
            System.out.println("No Profit No Loss");
        }
    }    
}
