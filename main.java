import java.util.Random;
import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char[][] board = {{' ', ' ', ' '}, 
                        {' ', ' ', ' '}, 
                        {' ', ' ', ' '}}; 
        printBoard(board);

        while(true){
            playerTurn(board, scanner);
            if(isGameFinished(board)){
                break;
            }                    
            computerTurn(board);
                       
        }
        scanner.close();


    }
    private static boolean hasContestantWon(char[][] board, char symbol){
        if((board[0][0] == symbol && board [0][1] == symbol && board [0][2] == symbol) ||
            (board[1][0] == symbol && board [1][1] == symbol && board [1][2] == symbol) ||
            (board[2][0] == symbol && board [2][1] == symbol && board [2][2] == symbol) ||

            (board[0][0] == symbol && board [1][0] == symbol && board [2][0] == symbol) ||
            (board[0][1] == symbol && board [1][1] == symbol && board [2][1] == symbol) ||
            (board[0][2] == symbol && board [1][2] == symbol && board [2][2] == symbol) ||

            (board[0][0] == symbol && board [1][1] == symbol && board [2][2] == symbol) ||
            (board[0][2] == symbol && board [1][1] == symbol && board [2][0] == symbol)) {
            return true;
            }
            return false;       
    }
    public static boolean isGameFinished(char[][]board){        
        if(hasContestantWon(board, 'X')){
            printBoard(board);
            System.out.println("Player wins!");
            return true;
        }

        if(hasContestantWon(board, 'O')){
            printBoard(board);
            System.out.println("Computer wins!");
            return true;
        } 

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == ' '){
                    return false;
                }
            }
        }
        printBoard(board);
        System.out.println("Its a tie!");
 
        return true; 
      
    }
    private static void computerTurn(char[][] board){
        Random rand = new Random();
        int play;
        while(true){
            play = rand.nextInt(9) + 1;
            if(isValidMove(board, Integer.toString(play))) {
                break;
            }
        }
        System.out.println("Computer chose " + play);
        placeMove( board, Integer.toString(play), 'O');
        
    }
    private static void placeMove(char[][] board, String position, char symbol){
        switch(position) {
            case "1":
                board[0][0] = symbol;
                break;
            case "2":
                board[0][1] = symbol;
                break;
            case "3":
                board[0][2] = symbol;
                break;
            case "4":
                board[1][0] = symbol;
                break;
            case "5":
                board[1][1] = symbol;
                break;
            case "6":
                board[1][2] = symbol;
                break;
            case "7":
                board[2][0] = symbol;
                break;
            case "8":
                board[2][1] = symbol;
                break;
            case "9":
                board[2][2] = symbol;
                break;
            default:
                System.out.println("not a valid input");    
        }
        printBoard(board);        
    } 

    private static boolean isValidMove(char[][] board, String position){
       switch(position) {
            case "1":
                if(board[0][0] == ' ') {
                    return true;
                }else{
                    return false;
                }           
            case "2":
                if(board[0][1] == ' ') {
                    return true;
                }else{
                    return false;
                }           
            case "3":
                if(board[0][2] == ' ') {
                    return true;
                }else{
                    return false;
                }           
            case "4":
                if(board[1][0] == ' ') {
                    return true;
                }else{
                    return false;
                }           
            case "5":
                if(board[1][1] == ' ') {
                    return true;
                }else{
                    return false;
                }           
            case "6":
                if(board[1][2] == ' ') {
                    return true;
                }else{
                    return false;
                }           
            case "7":
                if(board[2][0] == ' ') {
                    return true;
                }else{
                    return false;
                }           
            case "8":
                if(board[2][1] == ' ') {
                    return true;
                }else{
                    return false;
                }           
            case "9":
                if(board[2][2] == ' ') {
                    return true;
                }else{
                    return false;
                }           
            default:
                return false;   
        }
    }
    public static void playerTurn(char[][] board, Scanner scanner){
        String userInput;
        while(true){
            System.out.println("where would you like to play? (1-9)");
            userInput = scanner.nextLine();
            if(isValidMove(board, userInput)){
                break;
            }else{
                System.out.println(userInput + "is not a valid move");
            }            
        }
        placeMove(board, userInput, 'X');
    }

    public static void printBoard(char[][] board){
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }
}