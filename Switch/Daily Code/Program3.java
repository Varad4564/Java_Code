class Program3{
    public static void main(String[] args) {
        int key = 4;
        switch (key) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
            case 4:
                System.out.println("Four");
                case 5:
                System.out.println("Five");
                /*
                 * Even the statments in the default label are executed if the flow of code doesn't encounter a break statement   
                */
            default:
                System.out.println("Do not match");
        } 
        System.out.println("After Switch");
    }
}