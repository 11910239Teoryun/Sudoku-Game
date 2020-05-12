
import java.util.ArrayList;
import java.util.Arrays;

public class Validate {
	
	public Validate() {
		
	}
	
	public boolean validateMatRow(int[][] mat, int row) {

		//check row - check each row whether it contains repeating integer i
		ArrayList<Integer> counts = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0,0,0,0));
		boolean validity = true;
				for(int col = 0; col < mat.length; col++) {
					if(mat[row][col] > 0) {
						counts.set(mat[row][col]-1, counts.get(mat[row][col]-1)+1);
						if (counts.get(mat[row][col]-1) > 1) {
							validity = false;
							break;
						}
					}
					//System.out.println("row:"+row+"col:"+col+":"+counts);
				}
			
		return validity;
	}
	
	public boolean validateAllMatRows(int[][] mat) {

		//check row - check each row whether it contains repeating integer i
		ArrayList<Integer> counts = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0,0,0,0));
		boolean validity = true;
			for(int row = 0; row < mat.length; row++) {
				for(int col = 0; col < mat.length; col++) {
					if(mat[row][col] > 0) {
						counts.set(mat[row][col]-1, counts.get(mat[row][col]-1)+1);
						if (counts.get(mat[row][col]-1) > 1) {
							validity = false;
							break;
						}
					}
					//System.out.println("row:"+row+"col:"+col+":"+counts);
				}
				if (!validity) {
					break;
				}
				counts = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));
			}
			
		return validity;
	}
	
	public boolean validateMatCol(int[][] mat, int col) {		
		//check col - check each col whether it contains repeating integer i
		ArrayList<Integer> counts = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));
		boolean validity = true;
				for(int row = 0; row < mat.length; row++) {
					if(mat[row][col] > 0) {
						counts.set(mat[row][col]-1, counts.get(mat[row][col]-1)+1);
						if (counts.get(mat[row][col]-1) > 1) {
							validity = false;
							break;
						}
					}
				}

		return validity;
	}
	
	public boolean validateAllMatCols(int[][] mat) {		
		//check col - check each col whether it contains repeating integer i
		ArrayList<Integer> counts = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));
		boolean validity = true;
			for(int col = 0; col < mat.length; col++) {
				for(int row = 0; row < mat.length; row++) {
					if(mat[row][col] > 0) {
						counts.set(mat[row][col]-1, counts.get(mat[row][col]-1)+1);
						if (counts.get(mat[row][col]-1) > 1) {
							validity = false;
							break;
						}
					}
				}
				if (!validity) {
					break;
				}
				counts = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));
			}
		return validity;
	}

	public boolean validateSmallBox(int[][] mat, int row, int col) {		
		//check col - check each col whether it contains repeating integer i
		ArrayList<Integer> counts = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));
		boolean validity = true;
		int[] rows = new int[3];
		int[] cols = new int[3];
				if(row < 3) {
					rows = new int[]{0,1,2};
				}
				else if (row > 5) {
					rows = new int[]{3,4,5};
				}
				else if (row > 2 && row < 6){
					rows = new int[]{6,7,8};
				}
				if(col < 3) {
					cols = new int[]{0,1,2};
				}
				else if (col > 5) {
					cols = new int[]{3,4,5};
				}
				else if (col > 2 && col < 6){
					cols = new int[]{6,7,8};
				}
				
				for(int r: rows) {
					for (int c: cols) {
						if(mat[r][c] > 0) {
							counts.set(mat[r][c]-1, counts.get(mat[r][c]-1)+1);
							if (counts.get(mat[r][c]-1) > 1) {
								validity = false;
								break;
							}
						}
						//System.out.println("row:"+row+"col:"+col+":"+counts);
					}
						if (!validity) {
							break;
						}
				}
				
		return validity;
	}
	
	public boolean validateAllSmallBox(int[][] mat) {
		boolean validity = true;
		for(int col = 0; col < mat.length; col+=3) {
			for(int row = 0; row < mat.length; row+=3) {
				if(mat[row][col] > 0) {
						validity = validateSmallBox(mat,row,col);
						if(!validity) {
						break;
						}
					}
				}
				//System.out.println("row:"+row+"col:"+col+":"+counts);
				if(!validity) {
				break;
				}
			}
	return validity;
	}
	
	public boolean checkAll(int[][] mat) {
		boolean valid = validateAllMatRows(mat);
		if(valid) {
			valid = validateAllMatCols(mat);
		}
		if(valid) {
			valid = validateAllSmallBox(mat);
		}
		return valid;
	}
	
	public boolean checkCell(int[][] mat,int row,int col) {
		//System.out.println("Validating row - Currently in row :"+ row + " col " + col);
		boolean valid = validateMatRow(mat,row);
		if(valid) {
		//System.out.println("Validating column - Currently in row :"+ row + " col " + col);
			valid = validateMatCol(mat,col);
		}
		if(valid) {
			//System.out.println("Validating smallbox - Currently in row :"+ row + " col " + col);
			valid = validateSmallBox(mat,row,col);
		}

		return valid;
	}

	public boolean containsValidBlanks(int[][] mat) {
		boolean contains = true;
		checkUnique a = new checkUnique();
		for(int row = 0; row < mat.length; row++) {
			for(int col = 0; col < mat.length; col++) {
				if(mat[row][col] == 0 && a.solveCellByComparing(mat, row, col).size() == 0) {
					contains = false;
					break;
				}
					
			}
			if(!contains) {
				break;
			}
		}
		
		return contains;
	}
	
	public boolean isComplete(int[][] mat) {
		boolean isComplete = true;
		for(int row = 0; row < mat.length; row++) {
			for(int col = 0; col < mat.length; col++) {
				if(mat[row][col] == 0) {
					isComplete = false;
					break;
				}
			}
			if(!isComplete) {
				break;
			}
		}
		
		return isComplete;
	}
	
}
