class Solution {
    public int diagonalSum(int[][] mat) {
       int a=mat.length;
       int s=0;
       for(int i=0;i<a;i++)
       {
         int ps=mat[i][i];
         int ss=mat[i][a-i-1];
         s+=ps+ss;
       }
       if(a%2==0)
       return s;
       else
       return s-mat[a/2][a/2];
    }
}
