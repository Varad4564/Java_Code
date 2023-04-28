class Program13 {
    public static void main(String[] args) {
        int x = -7; //1111 1111 1111 1111 1111 1111 1111 1001

        System.out.println(x>>2);       //1111 1111 1111 1111 1111 1111 1111 1110 
        System.out.println(x<<2);       //1111 1111 1111 1111 1111 1111 1110 0100 
        System.out.println(x>>>30);     //0000 0000 0000 0000 0000 0000 0000 0010 

        // when we use the normal right shift operator for the negative values then it replaces the bit with 1 insetad of 0. However when we use the right shoft operator with 0 fill the it replaces the bits with 0 isnetad of one and it also shifts the most significant bit      
    }    
}
