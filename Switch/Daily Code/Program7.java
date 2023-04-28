class Program7{
    public static void main(String[] args) {
        int key = 3;
        switch (key) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 1+1:
                System.out.println("Second Two");
                break;
                /*
                * When we specify an expression in the label then that expresssion is evaluated first at the compile time and it is checked wheather the lable is duplicate or not 
                */
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println("Do not match");
        } 
        System.out.println("After Switch");
    }
} 
