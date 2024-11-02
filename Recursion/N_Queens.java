package DSA;
import java.util.*;
public class N_Queens {
    class Solution {
        public List<List<String>> solveNQueens(int n) {
            List<List<String>> ans=new ArrayList<>();
            List<String> board=new ArrayList<>();
            String s="";
            for (int i=0 ; i<n ; i++){
                s+='.';
            }
            for (int i=0 ; i<n ; i++){
                board.add(s);
            }
            solve (0,board,ans,n);
            return ans;
        }
        public void solve(int col , List<String> board , List<List<String>> ans , int n){
            if (col==n){
                ans.add(new ArrayList<>(board));
                return ;
            }
            for (int row=0 ; row<n ;row++){
                if (isSafe(row,col,board,n)){
                    String original=board.get(row);
                    char[] arr=original.toCharArray();
                    arr[col]='Q';
                    original=new String(arr);
                    board.set(row,original);
                    solve(col+1,board,ans,n);
                    arr[col]='.';
                    original=new String(arr);
                    board.set(row,original);
                }
            }
        }
        public boolean isSafe(int row , int col , List<String> board , int n){
            int duprow=row;
            int dupcol=col;
            while (row>=0 && col>=0){
                String temp=board.get(row);
                if (temp.charAt(col)=='Q') return false;
                row--;
                col--;
            }
            col=dupcol;
            row=duprow;
            while (col>=0){
                String temp=board.get(row);
                if (temp.charAt(col)=='Q') return false;
                col--;
            }
            col=dupcol;
            row=duprow;
            while (row<n && col>=0){
                String temp=board.get(row);
                if (temp.charAt(col)=='Q') return false ;
                row++;
                col--;
            }
            return true;
        }
    }
}
