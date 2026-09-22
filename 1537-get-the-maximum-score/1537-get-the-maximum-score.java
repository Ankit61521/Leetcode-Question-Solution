class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
       long s1=0,s2=0;
       int i=0,j=0;
       int n=nums1.length, m=nums2.length;
       long res=0;
       while(i<n && j<m){
        if (nums1[i]<nums2[j]){
            s1+=nums1[i];
            i+=1;
        }else if(nums2[j]<nums1[i]){
            s2+=nums2[j];
            j++;
        }else{
            res+=Math.max(s1,s2)+nums1[i];
            i++;
            j++;
            s1=0;
            s2=0;
        }
       }
       while (i<n){
        s1+=nums1[i++];
       }
       while(j<m){
        s2+=nums2[j++];
       }
       return(int)((Math.max(s1,s2)+res)%1_000_000_007);
    }
}