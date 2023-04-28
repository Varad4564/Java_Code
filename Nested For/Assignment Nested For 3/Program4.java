// class Program4 {
//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n+1-i; j++) {
//                 System.out.print("3C ");
//             }
//             System.out.println();
//         }
//     }    
// }

class Program4 {
    public static void main(String[] args) {
        int n = 4;
        int j = 1;
        for (int i = 1; i <= n; ) {
            System.out.print("3C ");
            j++;
            if(j == n+2-i){
                i++;
                j = 1;
                System.out.println();
            }
        }
    }    
}
