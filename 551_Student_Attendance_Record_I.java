class Solution {
    public boolean checkRecord(String s) 
    {
        int A = 0, L = 0, n = s.length();

        for(int i=0; i<n; i++)
        {
            if(s.charAt(i) == 'A')
            {
                A++;

                if( A >= 2)
                {
                    return false;
                }
            }

            if(s.charAt(i) == 'L')
            {
                L++;

                if (i+1 < n && s.charAt(i+1) == 'L')
                {
                    L++;
                }

                if(i+2 < n && s.charAt(i+2) == 'L')
                {
                    L++;
                }
                
                if(L >= 3)                
                {
                    return false;
                }

                L = 0;
            }            
        }

        return true;
    }
}