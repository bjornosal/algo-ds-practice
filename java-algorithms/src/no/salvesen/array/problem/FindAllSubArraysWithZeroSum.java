package no.salvesen.array.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * http://www.techiedelight.com/find-sub-array-with-0-sum/
 * Problem: Given an array of integers, print all sub-arrays with 0 sum.
 */
public class FindAllSubArraysWithZeroSum {

  public static void main(String[] args) {
    int[] arr = {4, 2, -3, -1, 0, 4};
    int[] arr2 = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};


    List<int[]> result = solve(arr2);

    result.stream().map(Arrays::toString).forEach(System.out::println);
  }


  private static List<int[]> solve(int[] arr) {
    List<int[]> subArrs = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      int sum = arr[i];

      if (sum == 0) {
        subArrs.add(new int[]{arr[i]});
      }

      List<Integer> sumArr = new ArrayList<>();
      sumArr.add(arr[i]);
      for (int j = i + 1; j < arr.length; j++) {
        sum += arr[j];
        sumArr.add(arr[j]);
        if (sum == 0) {
          int[] array = sumArr.stream().mapToInt(e -> e).toArray();
          subArrs.add(array);
        }
      }
    }

    return subArrs;
  }
}
