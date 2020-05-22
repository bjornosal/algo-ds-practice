package no.salvesen.array.problem;

import java.util.ArrayList;
import java.util.List;

public class FindPairWithGivenSum {

  /**
   * http://www.techiedelight.com/find-pair-with-given-sum-array/
   * Problem: Given an unsorted array of integers; find a pair with a given sum in it.
   */


  public static void main(String[] args) {

    int[] arr = {8, 7, 2, 5, 3, 1};

    int sum = 10;
    List<Pair> result = solve(arr, sum);
    result.forEach(System.out::println);
  }

  private static List<Pair> solve(int[] arr, int sum) {

    List<Pair> results = new ArrayList<>();

    for (int i = 0; i < arr.length / 2; i++) {
      for (int j = arr.length - 1; j > i; j--) {
        if (arr[i] + arr[j] == sum) {
          Pair pair = new Pair(i, j);
          results.add(pair);
        }
      }
    }

    return results;
  }

  private static class Pair {
    private int indexOne;
    private int indexTwo;


    public Pair(int indexOne, int indexTwo) {
      this.indexOne = indexOne;
      this.indexTwo = indexTwo;
    }

    public int getIndexOne() {
      return indexOne;
    }

    public void setIndexOne(int indexOne) {
      this.indexOne = indexOne;
    }

    public int getIndexTwo() {
      return indexTwo;
    }

    public void setIndexTwo(int indexTwo) {
      this.indexTwo = indexTwo;
    }

    @Override
    public String toString() {
      return "Pair{" +
              "indexOne=" + indexOne +
              ", indexTwo=" + indexTwo +
              '}';
    }
  }
}
