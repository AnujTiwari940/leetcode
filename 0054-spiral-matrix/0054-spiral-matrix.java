class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> res=new ArrayList<>();
        int fc=0,fr=0,lr=arr.length-1,lc=arr[0].length-1;
        while(fr<=lr && fc<=lc){
            for(int j=fc;j<=lc;j++){
                res.add(arr[fr][j]);
            }fr++;
            if(fr>lr || fc>lc)break;
            for(int i=fr;i<=lr;i++){
                res.add(arr[i][lc]);
           
            }lc--;
            if(fr>lr || fc>lc)break;

            for(int j=lc;j>=fc;j--){
                res.add(arr[lr][j]);
                
            }lr--;
            if(fr>lr || fc>lc)break;

            for(int i=lr;i>=fr;i--){
                res.add(arr[i][fc]);
                
            }fc++;
        }
        
    return res;}
}