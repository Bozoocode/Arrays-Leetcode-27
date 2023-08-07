package com.vamshi.arrayprogramms_Set2;
/*27. Remove Element
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
 * 
?*/
public class RemoveElement {
    public static int removeElement(int[] elements, int k) {
        int start = 0;
        for (int i = 0; i < elements.length; ++i) {
            if (elements[i] != k) {
                elements[start] = elements[i];
                start++;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] elements = {3, 2, 2, 3};
        int k = 3;
        System.out.println(removeElement(elements, k));
    }
}
