// class Program10 {
//     public static void main(String[] args) {
//         int n = 4;
//         int k = 1;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n+1-i; j++) {
//                 System.out.print(k+++" ");
//             }
//             System.out.println();
//             k--;
//         }
//     }    
// }

class Program10 {
    public static void main(String[] args) {
        int n = 4;
        int k = 1;
        int j = 1;
        for (int i = 1; i <= n; ) {
            System.out.print(k+++" ");
            j++;
            if(j==n+2-i){
                System.out.println();
                i++;
                j = 1;
                k--;
            }
        }
    }    
}
