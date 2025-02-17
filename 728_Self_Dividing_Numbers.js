/**
 * @param {number} left
 * @param {number} right
 * @return {number[]}
 */
var selfDividingNumbers = function(left, right) 
{
    let i=0, no=0, arr=[], temp=0, flag = 0;
    
    for(i=left; i<=right; i++)
    {
        no = i;
        
        while(no != 0)
        {
            temp = no % 10;

            if( i % temp  != 0)
            {
                flag = 1;
                break;
            }

            no = Math.trunc(no/10);
        }

        if(flag == 0)
        {
            arr.push(i);
        }

        flag = 0;
    }

    return arr;
};