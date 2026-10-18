class Solution {
    public boolean isPalindrome(String s) {
        
        int i = 0, n = s.length(), j = n-1;
        
        while(i <= j)
        {
            char lch = s.charAt(i);
            char rch = s.charAt(j);

            if(lch >= 'A' && lch <= 'Z')
            {
                lch += 32;
            }
            else if(!( (lch >= 'a' && lch <= 'z') || (lch >= '0' && lch <= '9') ))
            {
                while((i < n) && ( !( ( s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || ( s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9') ) ))
                {
                    i++;
                }

                if( (i < n) && (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
                {
                    lch = s.charAt(i);
                     
                     lch += 32;
                }
                else if((i < n))
                {
                    lch = s.charAt(i);
                }
                else
                {
                    lch = ' ';
                }
            }

            if(rch >= 'A' && rch <= 'Z')
            {
                rch += 32;
            }
            else if(! ( (rch >= 'a' && rch <= 'z') || (rch >= '0' && rch <= '9')) )
            {
                while((j >= 0) && ( !( ( s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || ( s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9' ))) )
                {
                    j--;
                }                

                if( (j >= 0) && (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z'))
                {
                    rch = s.charAt(j);

                    rch += 32;
                }
                else if(j>=0)
                {
                    rch = s.charAt(j);
                }
                else
                {
                    rch = ' ';
                }
            }

            if(rch != lch)
            {
                return false;
            }
            
            i++;
            j--;
        }

        return true;
    }
}

/* 
65
26
91
*/