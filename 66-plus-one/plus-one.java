class Solution {
    public int[] plusOne(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] + carry <= 9) {
                ans.add(arr[i] + carry);
                carry = 0;
            } else {
                ans.add(0);
                carry = 1;
            }
        }
            if (carry == 1){ ans.add(1);}
            Collections.reverse(ans);
            int[] array = new int[ans.size()];
            for(int  i =0;i<array.length;i++){
                array[i]=ans.get(i);
            }
            return array;
    }
}