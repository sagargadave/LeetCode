/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) 
{
    s = s.toLowerCase();

    let str = "";

    for(let ch  of s)    
    {
        if((ch>='a' && ch<='z') || (ch >= '0' && ch <= '9'))
        {
            str += ch;
        }
    }

    let reverstr = str.split('').reverse().join('');

    return str == reverstr;
};