//Happy Number
class Solution {
    public boolean isHappy(int n) {
        
        for(int i=0;i<=n;i++)
        {
            n=n%10;
            n=n/10;
            int sum=n*n;

            if(sum==1)
            {
                return true;
            }
            
        }
        return false;

    }
        
}
