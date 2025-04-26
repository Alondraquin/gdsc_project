import java.util.Random;
import java.util.Scanner;

public class main{
    public static void main(String[] args){

      char[][] board = {{' ', ' ', ' '}, 
                        {' ', ' ', ' '}, 
                        {' ', ' ', ' '}}; 
        printBoard(board);
        Scanner scanner = new Scanner(System.in);
        playerTurns(board, scanner);
        int play;
        Random rand = new Random();
        while(true){
            play = rand.nextInt(9) + 1;
            if(isValidMove(board, play)) {
                break;
            }
        }
        placeMove( board, Integer.toString(play), 'O');
        


        printBoard(board);




    }
    private static void placeMove(char[][] board, String position, char symbol){
        switch(position) {
            case "1":
                board[][] = symbol;
                break;
            case "2":
                board[][] = symbol;
                break;
            case "3":
                board[][] = symbol;
                break;
            case "4":
                board[][] = symbol;
                break;
            case "5":
                board[][] = symbol;
                break;
            case "6":
                board[][] = symbol;
                break;
            case "7":
                board[][] = symbol;
                break;
            case "8":
                board[][] = symbol;
                break;
            case "9":
                board[][] = symbol;
                break;
            default;
                System.out.println("not a valid input");    
        }
        printBoard(board);        
    } 

    private static boolean isSpaceAvailable(char[][] board, int position){
       switch(position) {
            case 1:
                if(board[0][0] == ' ') {
                    return true;
                }else{
                    return false;
                }           
            case 2:
                if(board[0][1] == ' ') {
                    return true;
                }else{
                    return false;
                }           
            case 3:
                if(board[0][2] == ' ') {
                    return true;
                }else{
                    return false;
                }           
            case 4:
                if(board[1][0] == ' ') {
                    return true;
                }else{
                    return false;
                }           
            case 5:
                if(board[1][1] == ' ') {
                    return true;
                }else{
                    return false;
                }           
            case 6:
                if(board[1][2] == ' ') {
                    return true;
                }else{
                    return false;
                }           
            case 7:
                if(board[2][0] == ' ') {
                    return true;
                }else{
                    return false;
                }           
            case 8:
                if(board[2][1] == ' ') {
                    return true;
                }else{
                    return false;
                }           
            case 9:
                if(board[2][2] == ' ') {
                    return true;
                }else{
                    return false;
                }           
            default;
                return false;   
        }
    }
    public static void playerTurns(char[][] board){
        Scanner scanner = new Scanner(System.in);

        System.out.println("where would you like to play? (1-9)");
        String userInput = scanner.nextLine();
       
        placeMove(board, userInput, 'X');
        scanner.close();
    }

    public static void printBoard(char[][] board){
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
    }
}