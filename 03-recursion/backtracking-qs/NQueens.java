import java.util.Arrays;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        int ways = queens(board, 0);
        System.out.println(ways);
    }

    static int queens(boolean[][] board, int row){
        if(row == board.length){
            // All the queens have been placed
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        // placing the queen and checking for every column
        for(int col = 0; col < board.length; col++){
            // place the queen if it is safe
            if (isSafe(board, row, col)){
                board[row][col] = true;
                count += queens(board, row + 1);

                // Backtracking, change it back to normal
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col){
        // column check
        for (int i = 0; i < row; i++){
            if(board[i][col]){
                return false;
            }
        }

        // diagonal left check - you can check diagonals only till you run to the 
        // edge of the board. You can reach the edge of the board by either 
        // running out of rows or running out of columns
        int maxLeft = Math.min(row, col);
        for(int i = 1; i <= maxLeft; i++){
            if(board[row - i][col - i]){
                return false;
            }
        }

        // diagonal right check - you can check diagonals only till you run to the 
        // edge of the board. You can reach the edge of the board by either 
        // running out of rows or running out of columns
        int maxRight = Math.min(row, board.length - col - 1);
        for(int i = 1; i <= maxRight; i++){
            if(board[row - i][col + i]){
                return false;
            }
        }

        // Why are we not running a horizontal check ?
        // -- In our algorithm, after an insertion has been made in a row, the 
        // recursion call automatically moves to the next row and we do not
        // attempt to insert multiple queens in a single row.

        // If all checks pass, we return true
        return true;
    }

    private static void display(boolean[][] board){
        for(boolean[] row: board){
            for(boolean element: row){
                if (element) System.out.print("Q ");
                else System.out.print("X ");
            }
            System.out.println();
        }
    }
}
