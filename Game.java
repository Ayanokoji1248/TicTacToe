import java.util.Scanner;

public class Game{

    Scanner sc =new Scanner(System.in);

    char [][]board={
        {'1','2','3'},
        {'4','5','6'},
        {'7','8','9'}
    };

    String player1;
    String player2;

    int xPos=0; //player-1
    int oPos=0; //player-2

    boolean xWin=false;
    boolean oWin=false;

    int count;

    public Game(){
        playerInfo();
        gameBoard();

        while (!xWin && !oWin && count < 9) {
            Player1();
            gameBoard();
            Check();
            if (!xWin && !oWin && count < 9) { // Check for draw
                Player2();
                gameBoard();
                Check();
            }
        }

        if (!xWin && !oWin && count == 9) {
            System.out.println("It's a draw!");
        }

    }

    public void gameBoard(){
        System.out.println();
        System.out.println("GAME BOARD");
        System.out.println(board[0][0] + " | "+ board[0][1]+ " | " + board[0][2]);
        System.out.println("--+---+---");
        System.out.println(board[1][0] + " | "+ board[1][1]+ " | " + board[1][2]);
        System.out.println("--+---+---");
        System.out.println(board[2][0] + " | "+ board[2][1]+ " | " + board[2][2]);
    }

    public void playerInfo(){
        System.out.println("Enter your name (Player-1): ");
        player1=sc.nextLine();

        System.out.println("Enter your name (Player-2): ");
        player2=sc.nextLine();
    }

    public void Player1() {
        while (true) {
            System.out.print("\n" + player1 + ", Enter the position where you want to place (X)");
            xPos = sc.nextInt();
    
            if (xPos > 9 || xPos <= 0) {
                System.out.println("Invalid Position! Try Again.");
            } else {
                switch (xPos) {
                    case 1:
                        board[0][0] = 'X';
                        break;
                    case 2:
                        board[0][1] = 'X';
                        break;
                    case 3:
                        board[0][2] = 'X';
                        break;
                    case 4:
                        board[1][0] = 'X';
                        break;
                    case 5:
                        board[1][1] = 'X';
                        break;
                    case 6:
                        board[1][2] = 'X';
                        break;
                    case 7:
                        board[2][0] = 'X';
                        break;
                    case 8:
                        board[2][1] = 'X';
                        break;
                    case 9:
                        board[2][2] = 'X';
                        break;
                    default:
                        break;
                }
                break; // Exit the loop if a valid position is entered
            }
        }
    }

    public void Player2() {
        while (true) {
            System.out.print("\n" + player2 + ", Enter the position where you want to place (O)");
            oPos = sc.nextInt();
    
            if (oPos > 9 || oPos <= 0) {
                System.out.println("Invalid Position! Try Again.");
            } else {
                switch (oPos) {
                    case 1:
                        board[0][0] = 'O';
                        break;
                    case 2:
                        board[0][1] = 'O';
                        break;
                    case 3:
                        board[0][2] = 'O';
                        break;
                    case 4:
                        board[1][0] = 'O';
                        break;
                    case 5:
                        board[1][1] = 'O';
                        break;
                    case 6:
                        board[1][2] = 'O';
                        break;
                    case 7:
                        board[2][0] = 'O';
                        break;
                    case 8:
                        board[2][1] = 'O';
                        break;
                    case 9:
                        board[2][2] = 'O';
                        break;
                    default:
                        break;
                }
                break; // Exit the loop if a valid position is entered
            }
        }
    }

    public void Check(){
        if(board[0][0]=='X' && board[0][1]=='X' && board[0][2]=='X'){
            xWin=true;
            System.out.println(player1+", is Winner");
        }
        else if(board[1][0]=='X' && board[1][1]=='X' && board[1][2]=='X'){
            xWin=true;
            System.out.println(player1+", is Winner");
        }
        else if(board[2][0]=='X' && board[2][1]=='X' && board[2][2]=='X'){
            xWin=true;
            System.out.println(player1+", is Winner");
        }
        else if(board[0][0]=='X' && board[1][0]=='X' && board[2][0]=='X'){
            xWin=true;
            System.out.println(player1+", is Winner");
        }
        else if(board[0][1]=='X' && board[1][1]=='X' && board[2][1]=='X'){
            xWin=true;
            System.out.println(player1+", is Winner");
        }
        else if(board[0][2]=='X' && board[1][2]=='X' && board[2][2]=='X'){
            xWin=true;
            System.out.println(player1+", is Winner");
        }
        else if(board[0][0]=='X' && board[1][1]=='X' && board[2][2]=='X'){
            xWin=true;
            System.out.println(player1+", is Winner");
        }
        else if(board[0][2]=='X' && board[1][1]=='X' && board[2][0]=='X'){
            xWin=true;
            System.out.println(player1+", is Winner");
        }



        else if(board[0][0]=='O' && board[0][1]=='O' && board[0][2]=='O'){
            oWin=true;
            System.out.println(player2+", is Winner");
        }
        else if(board[1][0]=='O' && board[1][1]=='O' && board[1][2]=='O'){
            oWin=true;
            System.out.println(player2+", is Winner");
        }
        else if(board[2][0]=='O' && board[2][1]=='O' && board[2][2]=='O'){
            oWin=true;
            System.out.println(player2+", is Winner");
        }
        else if(board[0][0]=='O' && board[1][0]=='O' && board[2][0]=='O'){
            oWin=true;
            System.out.println(player2+", is Winner");
        }
        else if(board[0][1]=='O' && board[1][1]=='O' && board[2][1]=='O'){
            oWin=true;
            System.out.println(player2+", is Winner");
        }
        else if(board[0][2]=='O' && board[1][2]=='O' && board[2][2]=='O'){
            oWin=true;
            System.out.println(player2+", is Winner");
        }
        else if(board[0][0]=='O' && board[1][1]=='O' && board[2][2]=='O'){
            oWin=true;
            System.out.println(player2+", is Winner");
        }
        else if(board[0][2]=='O' && board[1][1]=='O' && board[2][0]=='O'){
            oWin=true;
            System.out.println(player2+", is Winner");
        }
        else{
            count++;
            System.out.println(count);
        }
    }
    


}