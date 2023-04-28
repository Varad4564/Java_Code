// class Program3 {
//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(n*(n+1)/2+1-(i*(i-1)/2+j)+" ");
//             }
//             System.out.println();
//         }
//     }    
// }

class Program3 {
    public static void main(String[] args) {
        int n = 4;
        int j = 1;
        for (int i = 1; i <= n; ) {
            System.out.print(n*(n+1)/2+1-(i*(i-1)/2+j)+" ");
            j++;
            if(j==i+1){
                i++;
                j = 1;
                System.out.println();
            }
        }
    }    
}