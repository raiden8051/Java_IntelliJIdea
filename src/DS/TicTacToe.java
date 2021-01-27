package DS;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    static int ctr = 0;
    static boolean computerDifficulty = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want smart Computer?(y/n)");
        if(sc.next().charAt(0)=='y')
            computerDifficulty = true;
        System.out.println("Enter the position to place your move:");
        char[][] arr = new char[][]{{'-','-','-'},{'-','-','-'},{'-','-','-'}};
        drawBoard(arr);
        ArrayList<Integer> movesList = new ArrayList<>();
        while(true) {
            boolean validMove = false;
            while(!validMove) {
                int move = sc.nextInt();
                if (!movesList.contains(move)) {
                    movesList.add(move);
                    changeBoard(arr, interpretMoveI(move), interpretMoveJ(move), 'X');
                    validMove = true;
                }
            }
            if(checkResult(arr,'X')) {
                System.out.println("User Wins");
                break;
            }
            if(movesList.size()!=9)
                validMove = false;
            while(!validMove) {
                int move = getComputerMove(arr);
                if (!movesList.contains(move)) {
                    movesList.add(move);
                    changeBoard(arr, interpretMoveI(move), interpretMoveJ(move), '0');
                    validMove = true;
                }
            }
            drawBoard(arr);
            if(checkResult(arr,'0')) {
                System.out.println("Computer Wins");
                break;
            }
            if(movesList.size()==9) {
                System.out.println("It is a tie");
                break;
            }
        }
    }
    public static boolean checkResult(char[][] arr, char moveType){
        if(arr[0][0]==moveType && arr[0][1]==moveType && arr[0][2]==moveType)
            return true;
        else if(arr[1][0]==moveType && arr[1][1]==moveType && arr[1][2]==moveType)
            return true;
        else if(arr[2][0]==moveType && arr[2][1]==moveType && arr[2][2]==moveType)
            return true;
        else if(arr[0][0]==moveType && arr[1][0]==moveType && arr[2][0]==moveType)
            return true;
        else if(arr[0][1]==moveType && arr[1][1]==moveType && arr[2][1]==moveType)
            return true;
        else if(arr[0][2]==moveType && arr[1][2]==moveType && arr[2][2]==moveType)
            return true;
        else if(arr[0][0]==moveType && arr[1][1]==moveType && arr[2][2]==moveType)
            return true;
        else if(arr[0][2]==moveType && arr[1][1]==moveType && arr[2][0]==moveType)
            return true;
        return false;
    }
    public static int getComputerMove(char[][] arr){
        if(computerDifficulty){
            if(arr[0][0]=='X' && arr[0][1]=='X' && arr[0][2]!='0')
                return 3;
            else if(arr[1][0]=='X' && arr[1][1]=='X'  && arr[1][2]!='0')
                return 6;
            else if(arr[2][0]=='X' && arr[2][1]=='X'  && arr[2][2]!='0')
                return 9;
            else if(arr[0][1]=='X' && arr[0][2]=='X'  && arr[0][0]!='0')
                return 1;
            else if(arr[0][0]=='X' && arr[0][2]=='X'  && arr[0][1]!='0')
                return 2;
        }
        return (int) ((Math.random() * (9 - 1)) + 1);
    }
    public static int interpretMoveI(int move){
        switch (move){
            case 1: case 2: case 3: return 0;
            case 4: case 5: case 6: return 1;
            case 7: case 8: case 9: return 2;
        }
        return 0;
    }
    public static int interpretMoveJ(int move){
        switch (move){
            case 1: case 4: case 7: return 0;
            case 2: case 5: case 8: return 1;
            case 3: case 6: case 9: return 2;
        }
        return 0;
    }
    public static void changeBoard(char[][] arr,int moveI, int moveJ, char playerType){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(moveI == i && moveJ == j)
                    arr[moveI][moveJ] = playerType;
            }
        }
    }
    public static void drawBoard(char[][] arr){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                System.out.print("+"+arr[i][j]);
            }
            System.out.print("+");
            System.out.println();
        }
    }
}
