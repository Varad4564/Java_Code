class Program1{
    public static void main(String[] args) {
        // int arr[] = new int[];   When assigning memory to the array variable we need to either provide the  dimention or else we need to provide the data
    
        int arr1[];
        // arr1[] = new int[3];     // When we try to allocate the memory to the array after declaring the array reference variable then we cant use the square brackets  
        arr1 = new int[3];

        System.out.println(arr1.getClass());    // This is proof that it treats the 'int' in 'new int[]' as class

        int arr2[] = new int[5];
        int arr3[] = {10,20,30,40,50,60};
        int arr4[] = new int[]{1,2,3,4,5,6};
        
        // By default java assigns 0 value to integer array, null for array of object, 0.0 for float and false value for boolean array
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        
        // int arr5[] = new int[4]{1,2,3,4,5,6};    // We cannot assign dimention as well as data to an array when we are allocation memory to it

        //We can also declare an array in the following way
        int[] arr6;
        int[] arr7 = new int[5];
        
    }
}