class Solution {
    public int findDuplicate(int[] nums) {
        int a = 0;
        boolean[] check = new boolean[nums.length+1];
        for(int i = 0;i<nums.length;i++){
            if(check[nums[i]]==false){
                check[nums[i]]=true;
            }
            else {
                a= nums[i];
                break;
            }
        }
        return a;
    }
}