package DSA;
import java.util.*;
public class RatInAMaze {
    class Solution {
        public ArrayList<String> findPath(int[][] mat) {
            // Your code here
            ArrayList<String> temp=new ArrayList<>();
            if (mat.length==0 || mat[0][0]==0){
                return temp;
            }
            backtrack(mat,temp,0,0,"");
            return temp;
        }
        private void backtrack(int[][] mat , ArrayList<String> temp ,int row , int col ,String curr){
            if (row==mat.length-1 && col==mat[0].length-1){
                temp.add(curr);
                return ;
            }
            mat[row][col]=-1;
            if (row < mat.length - 1 && mat[row + 1][col] == 1) {
                backtrack(mat, temp, row + 1, col, curr + 'D');
            }
            // Move Up
            if (row > 0 && mat[row - 1][col] == 1) {
                backtrack(mat, temp, row - 1, col, curr + 'U');
            }
            // Move Right
            if (col < mat[0].length - 1 && mat[row][col + 1] == 1) {
                backtrack(mat, temp, row, col + 1, curr + 'R');
            }
            // Move Left
            if (col > 0 && mat[row][col - 1] == 1) {
                backtrack(mat, temp, row, col - 1, curr + 'L');
            }

            // Unmark the cell as visited for other paths
            mat[row][col] = 1;

        }
    }
}
