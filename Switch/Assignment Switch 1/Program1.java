import java.io.*;

class Program1{
    public static void main(String[] args) throws IOException {
        int math, science, sst, marathi, english, hindi;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        System.out.print("Enter the marks obtained in maths: ");
        math = Integer.parseInt(br.readLine());
        System.out.print("Enter the marks obtained in science: ");
        science =  Integer.parseInt(br.readLine());
        System.out.print("Enter the marks obtained in sst: ");
        sst =  Integer.parseInt(br.readLine());
        System.out.print("Enter the marks obtained in marathi: ");
        marathi =   Integer.parseInt(br.readLine());
        System.out.print("Enter the marks obtained in english: ");
        english =  Integer.parseInt(br.readLine());
        System.out.print("Enter the marks obtained in hindi: ");
        hindi =  Integer.parseInt(br.readLine());

        if(math<40||science<40||sst<40||marathi<40||english<40||hindi<40){
            System.out.println("You are failed");
        }
        else if(math>100||science>100||sst>100||marathi>100||english>100||hindi>100){
            System.out.println("invalid marks");
        }
        else{
            int sum = math+english+marathi+hindi+sst+science;
    
            switch (sum/120) {
                case 4:
                    System.out.println("First grade");
                    break;
                case 3:
                    System.out.println("second grade");
                    break;
                case 2:
                    System.out.println("third grade");
                    break;
                default:
                    System.out.println("Outoff marks");
                    break;
            }
        }

    }
}