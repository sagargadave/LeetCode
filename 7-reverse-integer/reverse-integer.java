class Solution {
    public int reverse(int x) 
    {
        int no = x; long reverse = 0;
       
            while(x != 0)
            {

                    reverse = (reverse *10 ) + (x % 10);
                    x = x / 10;            
            }

            if(reverse < -2147483648 || reverse > 2147483647)
            {
                    return 0;
            }

            return (int) reverse;
    }    
}