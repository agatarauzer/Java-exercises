/*
Beginner Series #3 Sum of Numbers

Instruction:
Given two integers a and b, which can be positive or negative, find the sum of all the numbers between including them too and return it. If the two numbers are equal return a or b.

Note: a and b are not ordered!
 */

package SumOfNumbers;


//Solution
public class Sum {
    public int GetSum(int a, int b)
    {
        if (a == b){
            return a;
        }

        int sum = 0;
        if (a > b){
          for (int i = b; i <= a; i++) {
              sum += i;
          }
        }
        else {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        }

        return sum;
    }
}
