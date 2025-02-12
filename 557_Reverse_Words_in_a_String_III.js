/**
 * @param {string} s
 * @return {string}
 */

// FIRST APPROACH

var reverseWords = function(s) 
{
    let i = 0, j = s.length-1,result = "",temp="";


    result = result.split('');

    for(i=0;i<s.length;i++)
    {
        while(true)
        {
            if(s[i] == ' ' || i== s.length)
            {
                result += temp;
                temp="";
                break;
            }
            temp = s[i] + temp;
            i++;
        }

        if(i != s.length)
        {
            result += s[i];
        }
    }

    return result.split('').join('');
};

// SECOND APPROACH

var reverseWords = function(s) 
{
    let i = 0,result = "",temp="";

    result = result.split('');

    for(i=0; i<=s.length; i++)
    {

        if(s[i] == ' ' || i== s.length)
        {
            result += temp;
            temp="";
            
            if(i != s.length)
            {
                result += s[i];
            }
        }            
        else if (i != s.length)
        {
            temp = s[i] + temp;
        }
    }    
    
    return result.split('').join('');
};