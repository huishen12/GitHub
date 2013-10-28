public class Solution {
    public int singleNumber(int[] A) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
    if(A.length<0)return -1;  
        int res = 0;  
        for(int i =0;i<A.length;i++)  
            res ^= A[i];  
        return res;  
    }
}