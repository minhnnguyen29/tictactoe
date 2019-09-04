import java.util.ArrayList;

public class User extends tictactoe {
    private String username;
    private Seed uSeedType;
    private static int gamesWon;
    private static int gamesPlayed;
    private Board board;
    private ArrayList<Cell> playedCells;
    public User() {//anonymous user
        username = "user" + totalUsers;//get user + no of user
        gamesWon = 0;
        gamesPlayed = 0;
        playedCells = new ArrayList<Cell>(); //create empty arrayList
        totalUsers++;
    }
    public User(String username) {
        this.username = username;
        gamesWon = 0;//user just started
        gamesPlayed = 0;
        playedCells = new ArrayList<Cell>(); //create empty arrayList
        totalUsers++;
    }

    public String getUsername(){
        return username;
    }

    public Seed getSeedType(){
        return uSeedType;
    }

    public void setSeed(char seed) {
        if (seed == 'X')
            uSeedType = Seed.X;
        else
            uSeedType = Seed.O;
    }
    public void setBoard(Board board) {
        this.board = board; //assign a specific boardtype to user
    }
    public void playMove(int rowpos, int colpos) {
        Cell curCell = new Cell(uSeedType, rowpos, colpos);
        playedCells.add(curCell);//add this new cell to currently played cell
    }
}
