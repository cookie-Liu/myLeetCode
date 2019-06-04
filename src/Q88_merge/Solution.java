package Q88_merge;

public class Solution {
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m = 3;
		int n = nums2.length;
		Solution solution = new Solution();
		solution.merge(nums1, m, nums2, n);
		for(int i:nums1)
			System.out.print(i+",");
	}

//	public void merge(int[] nums1, int m, int[] nums2, int n) {
//		int[] nums3 = new int[m];
//		for(int i=0;i<m;i++)
//			nums3[i] = nums1[i];
//		int i=0;int j=0;int idx=0;
//		while(i<m && j<n){
//			if(nums3[i] <= nums2[j]){
//				nums1[idx] = nums3[i];
//				i++;
//				idx++;
//			}
//			else{
//				nums1[idx] = nums2[j];
//				j++;
//				idx++;
//			}
//			
//		}
//		if(i != m){
//			for(int p=i;p<m;p++){
//				nums1[idx] = nums3[p];
//				idx++;
//			}
//
//		}
//		if(j != n){
//			for(int p=j;p<n;p++){
//				nums1[idx] = nums2[p];
//				idx++;
//			}				
//		}
//	}
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        //先归并大的，这样一遍扫面即可。
       for(int k = m+n-1,i = m-1,j = n-1;k >= 0;k--)
       {
           if(i < 0)
           {
               nums1[k] = nums2[j--];
               continue;
           }
           if(j < 0)
           {
               nums1[k] = nums1[i--];
               continue;
           }
           
           if(nums1[i] >= nums2[j])
               nums1[k] = nums1[i--];
           else
               nums1[k] = nums2[j--];
       }
    }
}
