/*
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字
*/

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int[][] move = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int row = matrix.length, col = matrix[0].length;
        boolean[][] visited = new boolean[row][col];
        int x = 0, y = -1, direc = 0;
        
        for(int i = 0; i < row * col; i++){
            for(int j = direc; j < 4; j = (j + 1) % 4){
                int nextX = x + move[j][0], nextY = y + move[j][1];
                if(nextX < 0 || nextX >= row || nextY < 0 || nextY >= col)
                    continue;
                if(!visited[nextX][nextY]){
                    direc = j;
                    x = nextX;
                    y = nextY;
                    ans.add(matrix[nextX][nextY]);
                    visited[nextX][nextY] = true;
                    break;
                }
            }
        }
        return ans;
    }
}