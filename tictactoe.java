import java.util.Scanner;

public class tictactoe {
    protected int totalUsers = 0;//get user usage
    protected int totalGames = 0;//get board usage
    public static void main(String[] args) {
        tictactoe ttt = new tictactoe(); //create an instace of class
        Scanner scanner = new Scanner(System.in).useDelimiter("\\s"); //create new Scanner class to get command arguments
        System.out.print("Enter username: ");
        User user1 = new User(scanner.next());
        user1.setSeed(scanner.next().charAt(0));//get first character for seed type
        System.out.print("Board size: ");
        int n = scanner. nextInt();


        //----------------------------Game Start-----------------------------
        System.out.println("Board " + n + "x" + n + " between " +
                user1.getUsername() + " as " + user1.getSeedType());
        Board boardgame = new Board(n);//create a new game with board size
        int currRow = -1;
        int currCol = -1;
        while(!boardgame.isEndGame()) {
            System.out.print("Enter next move in format (row column): ");
            currRow = scanner.nextInt();//get the first digit in input
            currCol = scanner.nextInt();//get the second digit in input
            System.out.println(currRow + " " + currCol);
            boardgame.drawBoard();
        }
    }//end of main()


}//end of class tictactoe