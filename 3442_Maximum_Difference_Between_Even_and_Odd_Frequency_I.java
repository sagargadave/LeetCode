class Solution 
{
    public int maxDifference(String s) 
    {
        char [] character = s.toCharArray();

        int highest = 0;
        int lowest = Integer.MAX_VALUE;

        char previous = character[0];

        for(int i=0; i<character.length; i++)
        {
            if(character[i] == previous && i>0)
            {
                continue;
            }
            int count = 0;

            for(int j=0; j<character.length;j++)
            {
                if(character[i] == character[j])
                {
                    count++;
                }
            }


            if((count%2)==0 && count < lowest){
                lowest=count;
            }

            if((count%2)!=0&& count > highest){
                highest=count;
            }

            previous = character[i];
        }
        
        return highest-lowest;

    }

}