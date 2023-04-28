// class Program8 {
//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print((char)(n*(n+1)/2+1-(i*(i-1)/2+j)+64)+" ");
//             }
//             System.out.println();
//         }
//     }    
// }

class Program8 {
    public static void main(String[] args) {
        int n = 4;
        int j = 1;
        for (int i = 1; i <= n; ) {
            System.out.print((char)(n*(n+1)/2+1-(i*(i-1)/2+j)+64)+" ");
            j++;
            if(j == i+1){
                i++;
                j = 1;
                System.out.println();
            }
        }
    }    
}
