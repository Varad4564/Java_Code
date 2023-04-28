class Program8 {
    public static void main(String[] args) {
        int key = 3;
        int a = 1;
        int b = 2;
        switch (key) {
            case a:
                System.out.println("One");
                break;
                /*
                * We cannot use a variable for lables in a switch block
                */
            case a+a:
                System.out.println("Two");
                break;
            case a+b:
                System.out.println("Three");
                break;
            case a+a+b:
                System.out.println("Four");
                break;
            case a+b+b:
                System.out.println("Five");
                break;
            default:
                System.out.println("Do not match");
        } 
        System.out.println("After Switch");
    }    
}
