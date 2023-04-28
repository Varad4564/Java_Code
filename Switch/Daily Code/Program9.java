class Program9 {
    public static void main(String[] args) {
        String day = "Mon";

        switch (day) {
            case "Mon":
                System.out.println("Monday");
                break;
                /*
                * Until java 1.6 string literals were not allowed as labels in the switch block.
                * However form java 1.7 version on wards string lietarls and enums are allowed to be used for labels in switch block in java 
                */
            case "Tues":
                System.out.println("Tuesday");
                break;
            case "Sun":
                System.out.println("Sunday");
                break;
        }
        System.out.println("End of switch");
    }    
}
