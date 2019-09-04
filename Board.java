public class Board extends tictactoe {
    private int markedMove;
    private Cell[][] game;
    public Board (int size){
        game = new Cell[size][size];//allocate array
        for (int row = 0; row < size; ++row) {
            for (int col = 0; col < size; ++col){
                game[row][col] = new Cell(size);//allocate each cell
            }
        }
        markedMove = 0;//move starts from 0
        totalGames++;//1 more game round is played
    }//end of constructor
    public boolean isEndGame(){
        if (markedMove == game.length*game.length)//if  all rows are ticked
            return true;//when theres no more move
        return false;
    }//end of isEndGame()

    public void clearBoard() {
        for(int row = 0; row < game.length; ++row){
            for (int col = 0; col < game.length; ++col) {
                game[row][col].clearCell();//clear each cell in board
            }
        }
    }//end of clearBoard()

    public void drawBoard() {
        for(int row = 0; row < game.length; ++row){
            for (int col = 0; col < game.length; ++col) {
                game[row][col].paintCell();//clear each cell in board
            }
            System.out.println();//go draw next row
        }
    }//end of drawBoard()
}//end class Board
