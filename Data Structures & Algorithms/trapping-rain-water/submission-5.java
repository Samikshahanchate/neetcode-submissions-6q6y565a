class Solution {
    public int trap(int[] height) {
        int n= height.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0]=height[0];
        right[n-1]=height[n-1];

        for(int i=1,j=n-2;i<n;i++,j--){
            left[i] = Math.max(height[i], left[i-1]);
            right[j] = Math.max(height[j],right[j+1]);
        }
        
        int sum=0;
        for(int i=0; i<n; i++){

        sum+=Math.min(left[i],right[i])-height[i];
       // System.out.print(sum+", ");
        }
      //  System.out.println();
       // System.out.println(Arrays.toString(height));
        //System.out.println(Arrays.toString(left));
        //System.out.println(Arrays.toString(right));
        
        return sum;
    }
}
