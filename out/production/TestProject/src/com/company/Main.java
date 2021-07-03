package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public int binarySearch(int[] arr, int l, int r, int wanted) {
        if(r >= 1) {
            int mid = (l + (r - 1)) / 2;
            if(wanted == arr[mid])
                return mid;
            else if (wanted > arr[mid])
                return binarySearch(arr, mid + 1, r, wanted);
            else
                return binarySearch(arr, l, mid - 1, wanted);
        }

        return -1;
    }


    public int numJewelsInStones(String jewels, String stones) {
        /*
            how many stones are also jewels?
            given:
                jewels - types of stones that are jewels.
                stones - each char in stones in a type of stone you have.

                jewels' chars are all unique
                jewels and stones are only english letters
                jewels.length >= 1

            construct hashmap from jewels string
            each key is one letter of jewels

            loop through stones
            if the char is in the jewelmap, then inc count by one.
        */

        HashSet<Character> jewelSet = new HashSet<>();
        for(int i = 0; i < jewels.length(); i++) {
            jewelSet.add(jewels.charAt(i));
        }

        int jewelCount = 0;
        for(int i = 0; i < stones.length(); i++) {
            if(jewelSet.contains(stones.charAt(i)))
                jewelCount++;
        }

        return jewelCount;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int indx = main.binarySearch(arr, 0, n, 10);
        System.out.println("Found value 10 at index: " + indx);
        // System.out.println(main.numJewelsInStones("z", "ZZ"));
    }
}
