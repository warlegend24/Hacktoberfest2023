class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> row1 = new ArrayList<Integer>();
        //preparing row 1:
        row1.add(1);
        List<Integer> row2 = new ArrayList<Integer>();
        row2.add(1);
        row2.add(1);
        //now updating the ans array with the first 2 row so we can use it for n number of rows:
        if(numRows==1){
            ans.add(row1);
            return ans;
        }
        if(numRows==2){
            ans.add(row1);
            ans.add(row2);
            return ans;
        }
        //if number of rows greater than 2:
        int n = numRows;
        for(int i=1;i<=n;i++){
            if(i==1){
                ans.add(row1);
                continue;
            }
            if(i==2){
                ans.add(row2);
                continue;
            }
            //for i>2 i.e number of orw sgreater than 2:
            List<Integer> rowi = new ArrayList<Integer>();
            rowi.add(1);
            //1 always at the 0th index of each row in the pascals triangle :
            //now updating the middle section of the row:
            for(int j=1;j<i-1;j++){
                rowi.add(ans.get(i-2).get(j-1) + ans.get(i-2).get(j));
            }
            //row always ends with 1:
            rowi.add(1);
            //and finally adding the row into the pascal's triangle:
            ans.add(rowi);


        }

        
          return ans;  
    }
}
