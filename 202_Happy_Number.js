
/*

Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

*/

/**
 * @param {number} n
 * @return {boolean}
 */

var isHappy = function(n) 
{
    if(n < 0)
    {
        return false;
    }

    let sq = 0;
    
    let flag = false;

    let num = n;

    while(true)
    {
        while(num > 0)
        {
            sq += (num % 10) * (num % 10);
            num = Math.trunc(num /10);
        }

        if(sq == 4)
        {
            flag = false;
            break;
        }
        else if(sq > 0 && sq == 1)
        {
            flag =  true;
            break;
        }

        num = sq;
        sq = 0;
    }
    return flag;
};

console.log(isHappy(7)); //true
console.log(isHappy(4)); //false
