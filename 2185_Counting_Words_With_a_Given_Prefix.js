/**
 * @param {string[]} words
 * @param {string} pref
 * @return {number}
 */
var prefixCount = function(words, pref) 
{
    let flag = 0,count = 0;

    for(let i=0; i<words.length; i++)
    {
        for(let j=0; j<pref.length; j++)
        {
            if(words[i][j] != pref[j])
            {
                flag = 1;
                break;
            }
        }

        if(flag == 0)
        {
            count++;
        }
        flag = 0;
    }
    return count;
};