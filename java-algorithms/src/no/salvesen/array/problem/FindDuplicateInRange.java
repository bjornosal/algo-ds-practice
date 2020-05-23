package no.salvesen.array.problem;

/**
 * Find duplicate element in a limited range array
 * http://www.techiedelight.com/find-duplicate-element-limited-range-array/
 * Given a limited range array of size n where array contains elements between 1 to n-1 with one element repeating, find the duplicate number in it.
 */
public class FindDuplicateInRange {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 4};
    int result = solve(arr);

    System.out.println("The duplicate is " + result);
  }

  private static int solve(int[] arr) {

    boolean[] seentIt = new boolean[arr.length];

    for (int value : arr) {
      if (seentIt[value]) {
        return value;
      }
      seentIt[value] = true;
    }
    return -1;
  }


}
