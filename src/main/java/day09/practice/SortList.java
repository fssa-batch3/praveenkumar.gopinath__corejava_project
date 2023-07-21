package day09.practice;

import java.util.Arrays;

public class SortList{
    public static void main(String[] args) {

        String[] input = {"8", "9", "45", "12", "1"};

        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
