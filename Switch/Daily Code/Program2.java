class Program2{
    public static void main(String[] args) {
        int key = 3;
        switch (key) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
            /*
             * If we dont specify the break after each label in the switch
             * If we dont specify a break then, when a lebel gets matched with the key then the instruction of that lable and instruction of all the subsequent labels are executed until a break statement is encounterd or untill the end of the switch 
             */
            case 4:
                System.out.println("Four");
            case 5:
                System.out.println("Five");
        } 
        System.out.println("After Switch");
    }
}