// class Program7 {
//     public static void main(String[] args) {
//         int n = 6;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print((char)(64+n+j-i)+" ");
//             }
//             System.out.println();
//         }
//     }    
// }

class Program7 {
    public static void main(String[] args) {
        int n = 6;
        int j = 1;
        for (int i = 1; i <= n;) {
            System.out.print((char)(64+n+j-i)+" ");
            j++;
            if(j==i+1){
                j = 1;
                i++;
                System.out.println();
            }
        }
    }    
}
