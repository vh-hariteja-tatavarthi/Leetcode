class Solution {

    public int count(int n, int numRows) {
        int column = 0;
        int nextfull = 0;


        while (n > 0) {
            if (column == nextfull) {
                n = n - numRows;
                nextfull = nextfull + (numRows - 1);
            } else {
                n--;
            }
            column++;
        }
        return column;

    }

    public String convert(String s, int numRows) {
        int n = s.length();
        int column = count(n, numRows);
        char[][] grid = new char[numRows][column];
        int k = 0, i = 0, j = 0;
        int nextfull = 0;
        int curr = 0;
        System.out.print(column);

        for(char[] o: grid){
            Arrays.fill(o,'4');
         }

        if (numRows == 1)
            return s;

        while (k < n) {
            if (i >= numRows) {
                i = numRows - 2;
                nextfull = nextfull + numRows - 1;
                j++;
            }
            if (j == nextfull) {
                grid[i][j] = s.charAt(k);
                k++;
                i++;
                curr++;
                continue;
            }
            grid[i][j] = s.charAt(k);
            k++;
            curr++;
            i--;
            j++;
        }

        StringBuilder sb = new StringBuilder();

        for (int l = 0; l < numRows; l++) {
            for (int m = 0; m < column; m++) {
                if(grid[l][m]!='4') sb.append(grid[l][m]);
            }
        }

        return sb.toString();

    }
}