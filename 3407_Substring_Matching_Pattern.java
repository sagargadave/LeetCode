class Solution {
    public boolean hasMatch(String s, String p) 
    {
        if(p.length() == 1)
        {
            return true;
        }
        
        if(p.charAt(0) == '*')
        {
            return false;
        }

        p = p.replace("*","");
        
        System.out.println(p);

        int count = p.length(),j = 0;

        if(count == 0)
        {
            return true;
        }

        for(int i = 0; i<s.length(); i++)    
        {
            if(s.charAt(i) == p.charAt(j))
            {
                j++;

                if(j==count)
                {
                    return true;
                }
            }
        }

        return false;
    }
}