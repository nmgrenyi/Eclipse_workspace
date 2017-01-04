package leetcode36;

import java.util.HashMap;

public class Solution {
	
	public HashMap validBoard(){
		HashMap<Character,Integer> validBoard = new HashMap<Character, Integer>();
        validBoard.put('1',0);
        validBoard.put('2',0);
        validBoard.put('3',0);
        validBoard.put('4',0);
        validBoard.put('5',0);
        validBoard.put('6',0);
        validBoard.put('7',0);
        validBoard.put('8',0);
        validBoard.put('9',0);
        
        return validBoard;
	}

	public boolean isValidSudoku(char[][] board) {
        int boardSize = board.length;
        boolean isValid = true;
        /*
        HashMap<Character,Integer> validBoard = new HashMap<Character, Integer>();
        validBoard.put('1',0);
        validBoard.put('2',0);
        validBoard.put('3',0);
        validBoard.put('4',0);
        validBoard.put('5',0);
        validBoard.put('6',0);
        validBoard.put('7',0);
        validBoard.put('8',0);
        validBoard.put('9',0);
        */
        //check rows
        for (int i=0 ;i<boardSize;i++){
            HashMap<Character,Integer> checkBoard = validBoard();
            for(int j=0;j<boardSize;j++){
                if (checkBoard.containsKey(board[i][j])){
                    checkBoard.replace(board[i][j],checkBoard.get(board[i][j])+1);
                }else if(board[i][j] == '.'){
                    
                }else{
                    isValid = false;
                    System.out.println("check rows: else element"+board[i][j]);
                }
            }
            /*
            System.out.println("row num: "+ i);
            for(char c : checkBoard.keySet()){
                System.out.print(c + " : ");
                System.out.println(checkBoard.get(c));
                
            }
            */
            for(char c : checkBoard.keySet()){
                if (checkBoard.get(c) >= 2){
                    isValid = false;
                    //System.out.println("check rows: wrong element"+ ": "+ c +": " + checkBoard.get(c));
                    
                }
            }
        }
        
        //check lines
        for (int i=0;i<boardSize;i++){
            HashMap<Character,Integer> checkBoard = validBoard();
            for(int j=0;j<boardSize;j++){
                if (checkBoard.containsKey(board[j][i])){
                    checkBoard.replace(board[j][i],checkBoard.get(board[j][i])+1);
                }else if(board[j][i] == '.'){
                    
                }else{
                    isValid = false;
                   // System.out.println("check lines: else element");
                }
            }
            for(char c : checkBoard.keySet()){
                if (checkBoard.get(c) >= 2){
                    isValid = false;
                    //System.out.println("check lines: wrong element"+ ": "+ c +": " +  checkBoard.get(c));
                }
            }
        }
        
        //check blocks
        for(int br=0;br<boardSize/3;br++){
            for(int bl=0;bl<boardSize/3;bl++){
                HashMap<Character,Integer> checkBoard = validBoard();
                for(int i=br*3;i<br*3+3;i++){
                    for(int j=bl*3;j<bl*3+3;j++){
                    	System.out.println(board[i][j]);
                        if (checkBoard.containsKey(board[i][j])){
                        	System.out.println("in if: "+board[i][j]);
                            checkBoard.replace(board[i][j],checkBoard.get(board[i][j])+1);
                        }else if(board[i][j] == '.'){
                    
                        }else{
                            isValid = false;
                            System.out.println("check blocks: else element");
                        }
                    }
                }
                
                
                System.out.println("br: "+br+";  bl: "+bl);
                for(char c : checkBoard.keySet()){
                    System.out.print(c + " : ");
                    System.out.println(checkBoard.get(c));
                    
                }
                System.out.println();
                
                for(char c : checkBoard.keySet()){
                if (checkBoard.get(c) >= 2){
                    isValid = false;
                    System.out.println("check blocks: wrong element"+ ": "+ c +": " +  checkBoard.get(c));
                }
            }
            }
        }
        
        return isValid;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution lc = new Solution();
		char [][] testChar = {{'.','.','.','.','5','.','.','.','.'},{'.','4','.','3','.','.','.','.','.'},{'.','.','.','.','.','3','.','.','1'},{'8','.','.','.','.','.','.','2','.'},{'.','.','2','.','7','.','.','.','.'},{'.','1','5','.','.','.','.','.','.'},{'.','.','.','.','.','2','.','.','.'},{'.','2','.','9','.','.','.','.','.'},{'.','.','4','.','.','.','.','.','.'}};
		System.out.println(lc.isValidSudoku(testChar));
	}

}
