/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function(s) 
{       
    let str1 = s , length = (s.length/2)+1
    let str2 = str1.split("").reverse().join("");

    if(str1 == str2)
    {            
        return str2;
    }

    if(s.length == 1)
    {
        return s;
    }

    let pallino = s[0];

    for(let i=0; i<s.length;i++)
    {
        for(let j = i+1; j<s.length; j++)
        {
            if(s[i] == s[j] && s[i+1] == s[j-1])
            {
                str1 = s.slice(i,j+1);
                str2 = str1.split("").reverse().join("");

                if(str1 == str2)
                {
                    if(pallino.length < str1.length)
                    {
                        pallino = str1;
                    }
                }
            }
        }
        if(pallino.length >length)
        {
            break;
        }
    }

    return pallino;
};