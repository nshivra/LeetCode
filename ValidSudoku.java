public class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        if (board == null || board.length != 9 || board[0].length != 9)
		    return false;
        
        HashMap<Character,Boolean> hTest = new HashMap<Character,Boolean>();
        hTest.put('1',true);hTest.put('2',true);hTest.put('3',true);hTest.put('4',true);
        hTest.put('5',true);hTest.put('6',true);hTest.put('7',true);hTest.put('8',true);hTest.put('9',true);
        
        HashMap<Character,Boolean> h0 = new HashMap<Character,Boolean>();
        HashMap<Character,Boolean> h1 = new HashMap<Character,Boolean>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(hTest.containsKey(board[i][j])){
                    if(h0.containsKey(board[i][j])){
                        System.out.println("1");
                        return false;
                    }
                    else{
                        h0.put(board[i][j],true);
                    }
                }
                
                if(hTest.containsKey(board[j][i]))
                {
                    
                    if(h1.containsKey(board[j][i])){
                        System.out.println("2");
                        return false;
                    }
                    else{
                        h1.put(board[j][i],true);
                    }
                }
            }
            h0.clear();
            h1.clear();
        }
        
        for (int block = 0; block < 9; block++) {
        	boolean[] m = new boolean[9];
        	for (int i = block / 3 * 3; i < block / 3 * 3 + 3; i++) {
        		for (int j = block % 3 * 3; j < block % 3 * 3 + 3; j++) {
                    if(hTest.containsKey(board[i][j])){
                        if(h0.containsKey(board[i][j])){
                            System.out.println("1");
                            return false;
                        }
                        else{
                            h0.put(board[i][j],true);
                        }
                    }
        		}
        	}
        	h0.clear();
        }
        
        return true;
    }
}
