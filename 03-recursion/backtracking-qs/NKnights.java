/**
 * NKnights
 */
public class NKnights {

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, 4);
    }

    static void knight(boolean[][] board, int row, int col, int knights){
        // Out of knights
        if(knights == 0){
            display(board);
            System.out.println();
            return;
        }
        // Out of bounds
        if (row == board.length - 1 && col == board.length){
            return;
        }

        if (col == board.length){
            // If we have reached the end of any row then we need to move to 
            // the next row and restart finding safe locations for the knight.
            // This is contrary to the queens problem where in one row there
            // was only one queen as there can be multiple knights in a row
            knight(board, row + 1, 0, knights);
            return;
        }

        if (isSafe(board, row, col)){
            board[row][col] = true;
            // If knight has been paced in a location then add a column and 
            // reduce the count of the knight and countinue recursion

            // NOTICE : Here, recursion is happening at a column-level but 
            // in NQueens problem, recursion occured at a row-level. (actually
            // cell level)
            knight(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }

        // add in backtracking logic (otherwise only one output is printed)
        knight(board, row, col + 1, knights);
    }

    private static boolean isSafe(boolean[][] board, int row, int col){
        // We have started creating the board from top to bottom so it makes
        // sense to check only the locations whose row is previous to the 
        // current rows. Otherwise according to a knights' movement, there are 
        // 4 other checks to be done - 
        // r + 1 -> col + 2
        // r + 1 -> col - 2
        // r + 2 -> col + 1
        // r + 2 -> col - 1


        // Check whether the row, col values are running out of the matrix 
        // or not. And the check if the knight already exists there or not
        if (isValid(board, row - 2, col - 1)){
            if (board[row - 2][col - 1]){
                return false;
            }
        } 

        // Check whether the row, col values are running out of the matrix 
        // or not. And the check if the knight already exists there or not
        if (isValid(board, row - 1, col - 2)){
            if (board[row - 1][col - 2]){
                return false;
            }
        } 

        // Check whether the row, col values are running out of the matrix 
        // or not. And the check if the knight already exists there or not
        if (isValid(board, row - 2, col + 1)){
            if (board[row - 2][col + 1]){
                return false;
            }
        } 

        // Check whether the row, col values are running out of the matrix 
        // or not. And the check if the knight already exists there or not
        if (isValid(board, row - 1, col + 2)){
            if (board[row - 1][col + 2]){
                return false;
            }
        } 

        // All checks passed
        return true;
    }

    // Boundary checker
    // This condition checker would have to be written many times for the 
    // isSafe function, best to make a function out of it and continue (DRY)
    static boolean isValid(boolean[][] board, int row, int col){
        if (row >= 0 && row < board.length && col >= 0 && col < board.length){
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board){
        for (boolean[] row: board){
            for (boolean element: row){
                if (element){
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
