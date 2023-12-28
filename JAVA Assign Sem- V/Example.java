class Example {
    static int a; // Move variable 'a' to the class level so it can be accessed in both functions
    static int b; // Move variable 'b' to the class level so it can be accessed in both functions
    static int c; // Move variable 'c' to the class level so it can be accessed in the main method

    static void function1() {
        a = 5;
        b = 5;
    }

    static void function2() {
        function1();
        c = a + b; // Assign the result of a + b to the variable 'c'
    }

    public static void main(String[] args) {
        function2(); // Call function2 to set the value of 'c'
        System.out.println("Result is " + c); // Print the result
    }
}
