// class Program5 {
//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n-i+1; j++) {
//                 System.out.print(n*(n+1)/2+i-1+" ");
//             }
//             System.out.println();
//         }
//     }    
// }

class Program5 {
    public static void main(String[] args) {
        int n = 4;
        int j = 1;
        for (int i = 1; i <= n; ) {
            System.out.print(n*(n+1)/2+i-1+" ");
            j++;
            if(j==n-i+2){
                j=1;
                i++; 
                System.out.println();
            }
        }
    }    
}
