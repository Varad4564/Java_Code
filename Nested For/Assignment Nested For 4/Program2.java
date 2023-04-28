// class Program2 {
//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = 1; i <= n; i++) {
//             int k = i*(i+1)/2;
//             for (int j = 1; j <= i; j++) {
//                 System.out.printf("%-2d ",k++);
//             }
//             System.out.println();
//         }
//     }    
// }

class Program2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int k = i*(i+1)/2;
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-2d ",k++);
            }
            System.out.println();
        }
    }    
}