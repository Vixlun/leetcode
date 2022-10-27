package dev.melnik.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {
    /*
    Input: l1 = [2,4,3], l2 = [5,6,4]
    Output: [7,0,8]
    Explanation: 342 + 465 = 807.
    Example 2:

    Input: l1 = [0], l2 = [0]
    Output: [0]
    Example 3:

    Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    Output: [8,9,9,9,0,0,0,1]
     */

    @Test
    public void example1() {
        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));

        Assertions.assertEquals(expected, solution.addTwoNumbers(l1, l2));
    }

    @Test
    public void example2() {
        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode expected = new ListNode(0);

        Assertions.assertEquals(expected, solution.addTwoNumbers(l1, l2));
    }

    @Test
    public void example3() {
        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        ListNode expected = new ListNode(0, new ListNode(1));

        Assertions.assertEquals(expected, solution.addTwoNumbers(l1, l2));
    }

    @Test
    /*
    Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    Output: [8,9,9,9,0,0,0,1]
     */
    public void example4() {
        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9,new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode expected = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(0, new ListNode(0, new ListNode(0,new ListNode(1))))))));

        Assertions.assertEquals(expected, solution.addTwoNumbers(l1, l2));
    }

}


