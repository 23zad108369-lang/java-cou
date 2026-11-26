// This program contains array index errors. Can you find and fix them?

package week3.week4.week5;

public class ArrayIndexDebug {
public static void main(String[] args) {

// Declare an array of 5 elements.
int[] numbers = {10, 20, 30, 40, 50};

// ============================================================
// BUG 1: Off-by-one error in loop condition
// ============================================================

System.out.println("=== BUG 1 ===");

// The intention: print all 5 elements.
// Valid indices are 0, 1, 2, 3, 4.
for (int i = 0; i < numbers.length; i++) {
System.out.println("numbers[" + i + "] = " + numbers[i]);
}

// ============================================================
// BUG 2: Accessing invalid index directly
// ============================================================

System.out.println("\n=== BUG 2 ===");

// The intention: access the last element.
System.out.println("Last element: " + numbers[numbers.length - 1]);

// ============================================================
// BUG 3: Negative index
// ============================================================

System.out.println("\n=== BUG 3 ===");

// The intention: access the first element.
System.out.println("First element: " + numbers[0]);
}
}