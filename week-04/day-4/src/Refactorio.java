public class Refactorio {
  // Create a recursive function called `refactorio`
  // that returns it's input's factorial
  public static void main(String[] args) {
    System.out.println(factorial(0));
  }

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    }
    if (n == 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }
}
