package codingbat.java.arrays1;

/*
Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
 */

public class Reverse3 {

    public static void main(String[] args) {
        reverse3(new int[] {3, 2, 1});
        reverse3(new int[] {5, 11, 9});
        reverse3(new int[] {7, 0, 0});
    }

    public static int[] reverse3(int[] nums) {
        return new int[] {nums[2], nums[1], nums[0]};
    }
}