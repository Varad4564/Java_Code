class Program1{
    public static void main(String[] args) {
        double var1 = 4.0/0;
        double var2 = 4.0/0;
        double var3 = 4.0/0;

        System.out. println(var1);          // This statement prints Infinity
        System.out. println(var1/var2);     // This statement prints NaN (Not a Number)
        System.out. println(var3);          // This statement prints -Infinity

        // Reason:  java follows IEEE floating-point standards/practices, and the IEEE standard for floating point numbers used has defined values for positive and negative infinity, and the special "not a number" case. See the contants in java.lang.Float and java.lang.Double for details.
    }
}