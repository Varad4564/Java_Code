class Program2 {
    public static void main(String[] args) {
        float x = 100f;
        if(x>98.6f){
            System.out.println("High Temprature");
        }
        else if(98f <= x  && x <= 98.6f){
            System.out.println("Normal Temprature");
        }
        else{
            System.out.println("Low Temprature");
        }
    }    
}
