class Program5{
    public static void main(String[] args) {
        int key = 3;
        switch (key) {
            default:
                System.out.println("Do not match");
                break;
                /*
                * Even if we specify the default block at the start of the switch block, It gets executed only when the key doesn't matches any other label in the switch block
                */
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
        } 
        System.out.println("After Switch");
    }
} 
