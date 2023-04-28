class Program1{
    public static void main(String[] args) {
        // x = 10; This would give us error as wee need to specify the data type in java 

        byte v1 = 18;
        byte v2 = 18;

        System.out.println(v1);
        System.out.println(v2);
        
        // v1 = v1 + v2;  This would give us error as the numeric value generated at runtime are treated as integer by java and integer cannot be implicitly typecasted to byte
        
        v1 = (byte)(v1+v2);

        System.out.println(v1);
        System.out.println(v2);

        System.out.println(v1+v2); // This would not give us error because we are not trying to store the interger value genarated by the addition of 2 byte into a byte variable 
    }
}