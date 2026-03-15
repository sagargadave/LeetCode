/* 
17. Letter Combinations of a Phone Number

Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example 1:
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Example 2:
Input: digits = "2"
Output: ["a","b","c"]
 
Constraints:
1 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].

Solution :
*/

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        Map<Character, String> h1 = new HashMap<>();
        h1.put('2', "abc");
        h1.put('3', "def");
        h1.put('4', "ghi");
        h1.put('5', "jkl");
        h1.put('6', "mno");
        h1.put('7', "pqrs");
        h1.put('8', "tuv");
        h1.put('9', "wxyz");
        
        backtrack(digits, 0, new StringBuilder(), result, h1);
        
        return result;        
    }

    private void backtrack(String digits, int idx, StringBuilder comb, List<String> result, Map<Character, String> h1) {
        if (idx == digits.length()) {
            result.add(comb.toString());
            return;
        }
        
        String letters = h1.get(digits.charAt(idx));
        for (char letter : letters.toCharArray()) {
            comb.append(letter);
            backtrack(digits, idx + 1, comb, result, h1);
            comb.deleteCharAt(comb.length() - 1);
        }
    }    
}