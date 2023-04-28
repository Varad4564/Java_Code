class Program3 {
    public static void main(String[] args) {
        if(true)
        System.out.println("Inside If1");
        System.out.println("Inside If2");
        else
            System.out.println("Inside else");

        // This code gives error because as the only the first printing statement is considered as the body of if block an the second printing statement is not considered inside if. Due to this the follwing else block has no if block associated with and hence it gives error  
    }    
}
