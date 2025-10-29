class Solution {
    public int strStr(String haystack, String needle) {

        int n1 = haystack.length(), n2 = needle.length();

        if(n1<n2)
        {
            return -1;
        }

        for(int i=0; i<n1; i++)
        {
            if(haystack.charAt(i) == needle.charAt(0))
            {
                int j = i, k = 0;

                while(j<n1 && k<n2 && haystack.charAt(j++) == needle.charAt(k++))
                {
                    if(k == n2 )                                               
                    {
                        return i;
                    }                                                            
                }                            
            }
        }
        
        
        return -1;
    }
}