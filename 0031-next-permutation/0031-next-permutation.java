class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int pvt=-1;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i-1]<arr[i]){
                pvt=i-1;
                break;
            }
        }
        if(pvt==-1){
            int left=0;
            int right=arr.length-1;
            while(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            
        }
        else{
            
            int idx=0;
            for(int i=arr.length-1;i>pvt;i--){
                if(arr[i]>arr[pvt]){
                    idx=i;
                    break;
                }
            }
        
        int temp1=arr[pvt];
        arr[pvt]=arr[idx];
        arr[idx]=temp1;
        int left=pvt+1;
            int right=arr.length-1;
            while(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
       }
    }
}
}