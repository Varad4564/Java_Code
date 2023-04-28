class Program10 {
    public static void main(String[] args) {
        String Plat = "Netflix";
        switch (Plat) {
            case "Netflix":
                {
                    String S1 = "Movie";
                    switch (S1) {
                        case "Movie":
                            System.out.println("Hindi Movie");
                            break;
                        case "Series":
                            System.out.println("Web series");
                            break;
                    }        
                }
                break;    
            case "Amazon":
                {
                    String S1 = "Movie";
                    switch (S1) {
                        case "Movie":
                            System.out.println("Marathi Movie");
                            break;
                        case "Series":
                            System.out.println("Web series");
                            break;
                    }        
                }   
                break;
        }
    }
}    