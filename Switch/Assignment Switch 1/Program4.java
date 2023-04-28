import java.io.*;

class Program4 {
    public static void main(String[] args) throws IOException {
        int num;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    
        System.out.println("Whats your intrest?");
        System.out.println("1.movies");
        System.out.println("2.series");
        System.out.println("Enter yor choice 1 or 2:");
        num = Integer.parseInt(br.readLine()); 
        
        switch (num) {
            case 1:
            {
                System.out.println("Movies you wish to watch today");
                System.out.println("1. Founder");
                System.out.println("2. Snowden");
                System.out.println("3. Jobs");
                System.out.println("4. Her");
                System.out.println("5. Social Network");
                System.out.println("6. Wall-E");
                System.out.println("7. AI");
                num = Integer.parseInt(br.readLine()); 
                
                switch(num){
                    case 1:
                        System.out.println("You are watching Founder");
                        break;
                    case 2:
                        System.out.println("You are watching Snowden");
                        break;
                    case 3:
                        System.out.println("You are watching Jobs");
                        break;
                    case 4:
                        System.out.println("You are watching Her");
                        break;
                    case 5:
                        System.out.println("You are watching Social Network");
                        break;
                    case 6:
                        System.out.println("You are watching Wall-E");
                        break;
                    case 7:
                        System.out.println("You are watching AI");
                        break;
                    default:
                        System.out.println("invalid input");
                    break;
                }        
            }
            break;
            case 2:
            {
                System.out.println("Best series to watch");
                System.out.println("1. Silicon Valley");
                System.out.println("2. Devs");
                System.out.println("3. The IT Croud");
                System.out.println("4. Mr Robot");
                num = Integer.parseInt(br.readLine()); 
                
                switch(num){
                    case 1:
                        System.out.println("You are watching Silicon Valley");
                        break;
                    case 2:
                        System.out.println("You are watching Devs");
                        break;
                    case 3:
                        System.out.println("You are watching The IT Croud");
                        break;
                    case 4:
                        System.out.println("You are watching Mr Robot");
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
            }
            break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
