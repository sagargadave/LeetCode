/*

Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Input: s = "IceCreAm"

Output: "AceCreIm"

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
*/


/**
 * @param {string} s
 * @return {string}
 */

var reverseVowels = function(s) 
{
    s = s.split('')
    let n = s.length-1, k = 0, j = 0 , i = 0;

    while (j<=n) 
    {
        if(s[n] == 'a' || s[n] == 'e' || s[n] == 'i' || s[n] == 'o' || s[n]== 'u'  || (s[n]== 'A' || s[n]== 'E' || s[n]== 'I' || s[n]== 'O' || s[n]== 'U' ) )
        {
            if (((s[j]== 'a' || s[j]== 'e' || s[j]== 'i' || s[j]== 'o' || s[j]== 'u' ) || (s[j]== 'A' || s[j]== 'E' || s[j]== 'I' || s[j]== 'O' || s[j]== 'U' ) )) 
            {
                let temp = s[n]; 
                    s[n] = s[j]; 
                    s[j] = temp; 
                    n--;
                    j++;
            }            
            else
            {
                j++;
            }
        }
        else            
        {
            n--;
        }
    }

    return s.join('');
};

