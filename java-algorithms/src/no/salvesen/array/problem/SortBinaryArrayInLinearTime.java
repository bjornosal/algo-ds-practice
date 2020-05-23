package no.salvesen.array.problem;

import java.util.Arrays;

/**
 * Sort Binary Array in Linear Time
 * http://www.techiedelight.com/sort-binary-array-linear-time/
 * Given a binary array, sort it in linear time and constant space. Output should print contain all zeroes followed by all ones.
 */
public class SortBinaryArrayInLinearTime {

  public static void main(String[] args) {
    int[] arr = {0, 1, 0, 1, 0, 1, 0, 0};
    int[] result = solve(arr);
    System.out.println(Arrays.toString(result));
  }

  //TODO: Is it O(n) (linear time)?
  //TODO: Is is constant space? Yes.
  private static int[] solve(int[] arr) {
    int amountOfZeros = 0;
    for (int value : arr) {
      if (value == 0) {
        amountOfZeros++;
      }
    }

    int[] result = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      if (i < amountOfZeros) {
        result[i] = 0;
      } else {
        result[i] = 1;
      }
    }
    return result;
  }
}
