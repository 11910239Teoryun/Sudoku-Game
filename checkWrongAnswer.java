import java.util.ArrayList;

public class checkWrongAnswer {
	private int[][] test = new int[9][9];
	private ArrayList<Integer> whereError= new ArrayList<>();
	
	public checkWrongAnswer() {
		
	}
	public checkWrongAnswer(int[][]Puzzle) {
		for(int row =0; row<Puzzle.length; row++) {
			for(int col=0; col<Puzzle[row].length; col++) {
				test[row][col]= Puzzle[row][col];
			}
		}
	}
	public boolean errorAt(int row, int col) {//must be sure the specified cell is filled else will have error probably XD
		boolean result = true;
		//checking the row
		for(int col1 = 0; col1 < 8; col1++) {
			if(col1!=col) {
		         if(test[row][col]==test[row][col1]) {
		            result = false;
		            whereError.add(row);
		            whereError.add(col1);
	}
			}
		}
		//checking col
		for(int row1 = 0; row1 < 8; row1++) {
			if(row1!=row) {
	         if(test[row][col]==test[row1][col]) {
	            result = false;
	            whereError.add(row1);
	            whereError.add(col);
	         }
}
		}
	    //check grid
	     int smallRow = row/3;
	     int smallCol = col/3;
	     int bigRow = smallRow*3;
	     int bigCol = smallCol*3;
	     for(int sRow =bigRow; sRow<bigRow+3; sRow++) {
	    	 for(int sCol = bigCol; sCol<bigCol+3; sCol++) {
	    		 if(sRow!=row&& sCol!=col) {
	    		 if(test[row][col]==test[sRow][sCol]) {
	    			 result = false;
	    			 whereError.add(sRow);
	    			 whereError.add(sCol);
	    		 }
	    	 }
	    	 }
	     }
	     
	     return result;
	}
	
	public int[] getError(){
		int [] error =new int [whereError.size()];
		for(int count =0; count<whereError.size(); count++) {
			error[count]=whereError.get(count);
		}//remember that all even index starting from 0 are rows, and the odds starting from one are cols
		return error;
	}
		
}
