class Program2 {
    public static void main(String[] args) {
        
        double x = 4.0/0;
        double y = 0.0/0;
        // Reason: Java follows IEEE standards. The IEEE has defined certain standards for floating point numbers which include definitions for "Not a Number" and positive and negative infinity. These do not apply to integers.
        System.out.println(x);
        System.out.println(y);

        // x = 4/0; // This would give arithimatic exception as the operaton on integers will be carried out first 



    }    
}
