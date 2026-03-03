/* 
118. Pascal's Triangle

Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:
Input: numRows = 1
Output: [[1]]
 
Constraints:
1 <= numRows <= 30

Solution :
*/

class Solution {

    private List getRow(int n) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        int result = 1;

        for (int i = 1; i < n; i++) {
            result *= (n - i);
            result /= i;
            l1.add(result);

        }

        return l1;
    }

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> Result = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            Result.add(getRow(i));
        }

        return Result;
    }
}