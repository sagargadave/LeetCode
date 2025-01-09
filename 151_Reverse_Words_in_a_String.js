/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) 
{
    let str1 = "";
    let str2 = "";

    for(let i = 0; i<s.length; i++)
    {
        if(s[i] != " " || s[i+1] != " " )
        {
            str1 += s[i]

            if(s[i] == " ")
            {
                str2 = str1 + str2;
                str1 = "";
            }
        }
    }

    str2 = str1 + " " + str2;
    str2 = str2.trim();
    
    return str2;
};