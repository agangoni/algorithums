//https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
public class {
    
    public static void main(String[] args) {
      
    }
    public int longestIncreasingPath(int[][] matrix) {
        
    }
    
    9  9  4
6  6  8
2  1  1
  
  
  
  
9  9  4
6  6  8
2  1  1

  
  
9  9  4 3
6  6  8 10
2  1  1 4
  
  
class Solution {
  	int longestPath = 0;
    
  public int longestIncreasingPath(int[][] matrix) {
      
      int nrow = matrix.length;
      int ncol = matrix[0].length;
      
    
    int[][] memo = int[r][c]; //-1
    
      	
      	for (int i=0; i<r; i++) {
          for(int j=0;j<c; j++) {
            recurse(matrix, nrow, ncol, i, j, -1)
          }
        }
    return longestPath;
    }
  
  public int recurse(int[][] matrix, int nrow, int ncol, int rp, int cp, int prev){
    int ret = 0;
    
      if(prev<matrix[rp][cp] && rp>=0 && rp<nrow && cp>=0 && cp<ncol){
        if(memo[rp][cp]==-1) {
          n = recurse(matrix, nrow, ncol, rp-1, cp);
          e = recurse(matrix, nrow, ncol, rp, cp+1);
          w = recurse(matrix, nrow, ncol, rp, cp-1);
          s = recurse(matrix, nrow, ncol, rp-1, cp);

          memo[rp][cp] =  Math.max(n, Math.max(e,Math.max(w,s)));
        }
        Math.max(longestPath, memo[rp][cp] + 1);
       return memo[rp][cp] + 1;  
      } else {
        return 0;
      }
    }
  }
}  
  
}
