/**
 * @param {number[]} arr
 * @return {number[][]}
 */
var minimumAbsDifference = function(arr) 
{
    arr.sort((a, b) => a - b);
    
    console.log(arr);

    let min = arr[1]-arr[0];

    let diff = 0;

    console.log(min);


    for(let i=0; i<arr.length-1; i++)    
    {
        diff = Math.abs(arr[i+1]-arr[i]);

        if( diff < min)
        {
            min =  diff;
        }

    }


    let array = [];

    for(let i=0; i<arr.length-1; i++)    
    {
        if(arr[i] < arr[i+1])
        {
            if(arr[i+1] - arr[i] == min)
            {
                let ar = [arr[i],arr[i+1]];
                array.push(ar);
            }            
        }
    }

    return array;
};