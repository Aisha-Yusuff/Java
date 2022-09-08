package calculator;

public class Calculator {
    public static void main(String[] args) {
    }
    Integer add(int integer1, int integer2) {
        return integer1 + integer2;
    }
}


// DEBUGGING
// Before:
// Error - Type mismatch: cannot convert from int to String

// package gradle;

// public class Calculator {
//   public String add(Integer a, Integer b) {
//     return a + b;
//   }
// }


// After:
//  Remove package gradle
//  Turn type for method output from string to integer

// public class Calculator {
//   public Integer add(Integer a, Integer b) {
//     return a + b;
//   }
// }
