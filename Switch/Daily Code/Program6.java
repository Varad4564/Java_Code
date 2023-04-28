class Program6{
    public static void main(String[] args) {
        int key = 3;
        switch (key) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            /*
            * Lables cannot be duplicate inside a switch block, not even the default label can be duplicate
            */
            case 3:
                System.out.println("Three");
                break;
            case 2:
                System.out.println("Second Two");
                break;
            case 3:
                System.out.println("Second Three");
                break;
            default:
                System.out.println("Do not match");
        } 
        System.out.println("After Switch");
    }
} 
