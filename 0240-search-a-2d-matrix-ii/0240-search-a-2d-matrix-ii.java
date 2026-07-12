class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m=arr.length,n=arr[0].length;
        int i=0;
        int j=n-1;
        while(j>=0 && i<m){  //T.C.=(m+n)
            if(arr[i][j]>target) j--; //go left
            else if(arr[i][j]<target) i++;  //go down
            else return true;
        }
return false;
    }
}