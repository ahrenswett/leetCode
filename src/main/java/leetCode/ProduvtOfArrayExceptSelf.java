package leetCode;

public class ProduvtOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
//        set a var equal to the length of the input array
        int n = nums.length;
//        create an answer array and a left array. The ans array will double as a right array.
        int[] left = new int[n];
        int[] ans = new int[n];

//        because the set the first index to 1, it will be multiplied by the same index in the input array to set the next index in left.
//        Product at current index = left[index of product -1] * input[index of product -1]
        left[0] = 1;
        for(int i = 1; i < n; i++){
            left[i] = left[i-1]*nums[i-1];
        }
//        do the same as above except from the right to the left
//        Product at current index = right[index of product +1] * input[index of product +1]
        ans[n-1] = 1;
        for(int j = n-2; j >= 0; j--){
            ans[j] = ans[j+1]*nums[j+1];
        }
//      multiply the products by each other and return the answer array
        for(int k = 0; k < n; k++){
            ans[k] = left[k]*ans[k];
        }
        return ans;
    }
}
