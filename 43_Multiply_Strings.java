/* 
43. Multiply Strings

Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

Example 1:
Input: num1 = "2", num2 = "3"
Output: "6"

Example 2:
Input: num1 = "123", num2 = "456"
Output: "56088"
 
Constraints:
1 <= num1.length, num2.length <= 200
num1 and num2 consist of digits only.
Both num1 and num2 do not contain any leading zero, except the number 0 itself.

SOlution :
*/

class Solution {

    public String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0"))
            return "0";

        int n1 = num1.length(), n2 = num2.length();

        String multiplication = "";
        String result = "0";
        int temp = 0;

        for (int i = n2 - 1; i >= 0; i--) {

            int no1 = num2.charAt(i) - '0';
            multiplication = "";
            temp = 0;

            for (int j = n1 - 1; j >= 0; j--) {

                int no2 = num1.charAt(j) - '0';

                temp = (no1 * no2) + temp;

                multiplication = (temp % 10) + multiplication;

                temp /= 10;
            }

            if (temp > 0) {
                multiplication = temp + multiplication;
            }

            for (int k = 0; k < (n2 - 1 - i); k++) {
                multiplication += "0";
            }

            result = addStrings(result, multiplication);
        }

        return result;
    }

    public String addStrings(String a, String b) {

        String res = "";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {

            int sum = carry;

            if (i >= 0)
                sum += a.charAt(i--) - '0';

            if (j >= 0)
                sum += b.charAt(j--) - '0';

            res = (sum % 10) + res;
            carry = sum / 10;
        }

        return res;
    }
}
