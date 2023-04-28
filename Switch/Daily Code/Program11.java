class Program11 {
    public static void main(String[] args) {
        
        String S1 = "Veg";
        switch (S1) {
            case "Veg":
                {
                    String S2 = "Starter";
                    switch (S2) {
                        case "Starter":
                            System.out.println("Masala Papad");
                            break;
                    
                        case "Main Course":
                            System.out.println("Panner Tikka Masala");
                            break;
                    }                    
                }
                break;
                
            case "Non Veg":
                {
                    String S2 = "Starter";
                    switch (S2) {
                        case "Starter":
                            System.out.println("Chicken Lolipop");
                            break;
                    
                        case "Main Course":
                            System.out.println("Chicken Tikka Masala");
                            break;
                    }                       
                }
                break;
        }
        System.out.println("After switch");
    }    
}
