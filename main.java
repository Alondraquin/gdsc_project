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

        Random rand = new Random();
        while(true){
            int play = rand.nextInt(9) + 1;
            if(isValidMove(board, play)) {
                break;
            }
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
    public static void playerTurns(char[][] board, Scanner scanner){
        System.out.println("where would you like to play? (1-9)");
        String userInput = scanner.nextLine();
        switch(userInput) {
            case "1":
                board[][] = 'X';
                break;
            case "2":
                board[][] = 'X';
                break;
            case "3":
                board[][] = 'X';
                break;
            case "4":
                board[][] = 'X';
                break;
            case "5":
                board[][] = 'X';
                break;
            case "6":
                board[][] = 'X';
                break;
            case "7":
                board[][] = 'X';
                break;
            case "8":
                board[][] = 'X';
                break;
            case "9":
                board[][] = 'X';
                break;
            default;
                System.out.println("not a valid input");    
        }
        printBoard(board);
    }

    public static void printBoard(char[][] board){
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
    }
}