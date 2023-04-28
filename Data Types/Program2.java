class Program2 {
    int x = 10; // Instance variable
    
    void method(){
        System.out.println("This is an instance method");
    }

    public static void main(String[] args) {
        // float f = 45.64; This would give us error because the point seperated numeric values are considered as double by by the java. We need to specify 'f' at the end of pointe seperated numeric values in order to make it float
        
        float f = 45.64f;
        System.out.println(f);
        int y = 10;
        
        // System.out.println(x); This would give us an error: non static variable x cannot be referenced from a static context
        
        // Reason: This is because the memory to instance variable is allocated when an object of that class is created
        
        System.out.println(y);
        
        // method(); This would give us an error: non-static method method() cannot be referenced from a static context
        
        // Reason: This is because the instance method is accessible only when an object of that class is created   
    }    
}
