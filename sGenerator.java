import java.util.Random;

public class sGenerator {
	private int[][] Sudoku;
	private int[][] Puzzle;
	
	public sGenerator(int level) {
		sBank Bank = new sBank(level);
		Puzzle = Bank.getPuzzle();
		Sudoku = Bank.getSolution();
			//Scrambling the big rows first 
					//A(row0),B(row3),C(row6)
					Random bigRows = new Random();
					int bigR = bigRows.nextInt(6);
					switch(bigR) {
					case 0:{ //original:ABC
						break;
					}
					case 1:{ // swap 1, ACB
						int temp;
						for(int rows =0; rows<3;rows++) {
							for(int col = 0; col<9; col++) {
								temp= Sudoku[rows+3][col];//storing B rows into temp
								Sudoku[rows+3][col]=Sudoku[rows+6][col];//C into B
								Sudoku[rows+6][col]=temp;//B into C
								
								temp= Puzzle[rows+3][col];//storing B rows into temp
								Puzzle[rows+3][col]=Puzzle[rows+6][col];//C into B
								Puzzle[rows+6][col]=temp;//B into C
							}
						}
						break;
					}
					case 2:{ //swap1,BAC
						int temp;
						for(int rows =0; rows<3;rows++) {
							for(int col = 0; col<9; col++) {
								temp= Sudoku[rows][col];//storing A rows into temp
								Sudoku[rows][col]=Sudoku[rows+3][col];//B into A
								Sudoku[rows+3][col]=temp;//A into B
								
								temp= Puzzle[rows][col];//storing A rows into temp
								Puzzle[rows][col]=Puzzle[rows+3][col];//B into A
								Puzzle[rows+3][col]=temp;//A into B
							}
						}
						break;
						
					}
					case 3:{//swap 2,BCA
						int temp;
						for(int rows =0; rows<3;rows++) {
							for(int col = 0; col<9; col++) {
								temp= Sudoku[rows][col];//storing A rows into temp
								Sudoku[rows][col]=Sudoku[rows+3][col];//B into A
								Sudoku[rows+3][col]=Sudoku[rows+6][col];//C into B
								Sudoku[rows+6][col]=temp;//A value stored to C rows
								
								temp= Puzzle[rows][col];//storing A rows into temp
								Puzzle[rows][col]=Puzzle[rows+3][col];//B into A
								Puzzle[rows+3][col]=Puzzle[rows+6][col];//C into B
								Puzzle[rows+6][col]=temp;//A value stored to C rows
							}
						}
						break;
					}
					case 4:{//swap 2,CAB
						int temp;
						for(int rows =0; rows<3;rows++) {
							for(int col = 0; col<9; col++) {
								temp= Sudoku[rows][col];//storing A rows into temp
								Sudoku[rows][col]=Sudoku[rows+6][col];//C values into A
								Sudoku[rows+6][col]=Sudoku[rows+3][col];//B values into C
								Sudoku[rows+3][col]=temp;//A value stored to B rows
								
								temp= Puzzle[rows][col];//storing A rows into temp
								Puzzle[rows][col]=Puzzle[rows+6][col];//C values into A
								Puzzle[rows+6][col]=Puzzle[rows+3][col];//B values into C
								Puzzle[rows+3][col]=temp;//A value stored to B rows
							}
						}
						break;
						
					}
					case 5:{//swap 1, CBA
						int temp;
						for(int rows =0; rows<3;rows++) {
							for(int col = 0; col<9; col++) {
								temp= Sudoku[rows][col];//storing A rows into temp
								Sudoku[rows][col]=Sudoku[rows+6][col];//C values into A
								Sudoku[rows+6][col]=temp;//A value stored to C rows
								
								temp= Puzzle[rows][col];//storing A rows into temp
								Puzzle[rows][col]=Puzzle[rows+6][col];//C values into A
								Puzzle[rows+6][col]=temp;//A value stored to C rows
							}
						}
						break;
					}
					}
			
			//Now Scrambling the big columns
					Random bigCols = new Random();
					int bigC = bigCols.nextInt(6);
					switch(bigC) {
					case 0:{ //original:ABC
						break;
					}
					case 1:{ // swap 1, ACB
						int temp;
						for(int cols =0; cols<3;cols++) {
							for(int rows = 0; rows<9; rows++) {
								temp= Sudoku[rows][cols+3];//storing B rows into temp
								Sudoku[rows][cols+3]=Sudoku[rows][cols+6];//C into B
								Sudoku[rows][cols+6]=temp;//B into C
								
								temp= Puzzle[rows][cols+3];//storing B rows into temp
								Puzzle[rows][cols+3]=Puzzle[rows][cols+6];//C into B
								Puzzle[rows][cols+6]=temp;//B into C
							}
						}
						break;
					}
					case 2:{ //swap1,BAC
						int temp;
						for(int col =0; col<3;col++) {
							for(int rows = 0; rows<9; rows++) {
								temp= Sudoku[rows][col];//storing A rows into temp
								Sudoku[rows][col]=Sudoku[rows][col+3];//B into A
								Sudoku[rows][col+3]=temp;//A into B
								
								temp= Puzzle[rows][col];//storing A rows into temp
								Puzzle[rows][col]=Puzzle[rows][col+3];//B into A
								Puzzle[rows][col+3]=temp;//A into B
							}
						}
						break;
						
					}
					case 3:{//swap 2,BCA
						int temp;
						for(int col =0; col<3;col++) {
							for(int rows = 0; rows<9; rows++) {
								temp= Sudoku[rows][col];//storing A rows into temp
								Sudoku[rows][col]=Sudoku[rows][col+3];//B into A
								Sudoku[rows][col+3]=Sudoku[rows][col+6];//C into B
								Sudoku[rows][col+6]=temp;//A value stored to C rows
								
								temp= Sudoku[rows][col];//storing A rows into temp
								Puzzle[rows][col]=Puzzle[rows][col+3];//B into A
								Puzzle[rows][col+3]=Puzzle[rows][col+6];//C into B
								Puzzle[rows][col+6]=temp;//A value stored to C rows
							}
						}
						break;
					}
					case 4:{//swap 2,CAB
						int temp;
						for(int col =0; col<3;col++) {
							for(int rows = 0; rows<9; rows++) {
								temp= Sudoku[rows][col];//storing A rows into temp
								Sudoku[rows][col]=Sudoku[rows][col+6];//C values into A
								Sudoku[rows][col+6]=Sudoku[rows][col+3];//B values into C
								Sudoku[rows][col+3]=temp;//A value stored to B rows
								
								temp= Sudoku[rows][col];//storing A rows into temp
								Puzzle[rows][col]=Puzzle[rows][col+6];//C values into A
								Puzzle[rows][col+6]=Puzzle[rows][col+3];//B values into C
								Puzzle[rows][col+3]=temp;//A value stored to B rows
							}
						}
						break;
						
					}
					case 5:{//swap 1, CBA
						int temp;
						for(int col =0; col<3;col++) {
							for(int rows = 0; rows<9; rows++) {
								temp= Sudoku[rows][col];//storing A rows into temp
								Sudoku[rows][col]=Sudoku[rows][col+6];//C values into A
								Sudoku[rows][col+6]=temp;//A value stored to C rows
								
								temp= Puzzle[rows][col];//storing A rows into temp
								Puzzle[rows][col]=Puzzle[rows][col+6];//C values into A
								Puzzle[rows][col+6]=temp;//A value stored to C rows
							}
						}
						break;
					}
					}
					
			//Scrambling the little Rows in the big Rows
			int largeRow =0;
				while(largeRow<9) {
					Random largeRows = new Random();
					int largeR = largeRows.nextInt(6);
					switch(largeR) {
					case 0:{ //original:ABC
						break;
					}
					case 1:{ // swap 1, ACB
						int temp;
						int rows =largeRow;
							for(int col = 0; col<9; col++) {
								temp= Sudoku[rows+1][col];//storing B rows into temp
								Sudoku[rows+1][col]=Sudoku[rows+2][col];//C into B
								Sudoku[rows+2][col]=temp;//B into C
								
								temp= Puzzle[rows+1][col];//storing B rows into temp
								Puzzle[rows+1][col]=Puzzle[rows+2][col];//C into B
								Puzzle[rows+2][col]=temp;//B into C
							}
						break;
					}
					case 2:{ //swap1,BAC
						int temp;
						int rows =largeRow;
							for(int col = 0; col<9; col++) {
								temp= Sudoku[rows][col];//storing A rows into temp
								Sudoku[rows][col]=Sudoku[rows+1][col];//B into A
								Sudoku[rows+1][col]=temp;//A into B
								
								temp= Puzzle[rows][col];//storing A rows into temp
								Puzzle[rows][col]=Puzzle[rows+1][col];//B into A
								Puzzle[rows+1][col]=temp;//A into B
							}
						break;
						
					}
					case 3:{//swap 2,BCA
						int temp;
						int rows =largeRow;
							for(int col = 0; col<9; col++) {
								temp= Sudoku[rows][col];//storing A rows into temp
								Sudoku[rows][col]=Sudoku[rows+1][col];//B into A
								Sudoku[rows+1][col]=Sudoku[rows+2][col];//C into B
								Sudoku[rows+2][col]=temp;//A value stored to C rows
								
								temp= Puzzle[rows][col];//storing A rows into temp
								Puzzle[rows][col]=Puzzle[rows+1][col];//B into A
								Puzzle[rows+1][col]=Puzzle[rows+2][col];//C into B
								Puzzle[rows+2][col]=temp;//A value stored to C rows
							}
						break;
					}
					case 4:{//swap 2,CAB
						int temp;
						int rows =largeRow;
							for(int col = 0; col<9; col++) {
								temp= Sudoku[rows][col];//storing A rows into temp
								Sudoku[rows][col]=Sudoku[rows+2][col];//C values into A
								Sudoku[rows+2][col]=Sudoku[rows+1][col];//B values into C
								Sudoku[rows+1][col]=temp;//A value stored to B rows
								
								temp= Puzzle[rows][col];//storing A rows into temp
								Puzzle[rows][col]=Puzzle[rows+2][col];//C values into A
								Puzzle[rows+2][col]=Puzzle[rows+1][col];//B values into C
								Puzzle[rows+1][col]=temp;//A value stored to B rows
							}
						break;
					}
					case 5:{//swap 1, CBA
						int temp;
						int rows =largeRow;
							for(int col = 0; col<9; col++) {
								temp= Sudoku[rows][col];//storing A rows into temp
								Sudoku[rows][col]=Sudoku[rows+2][col];//C values into A
								Sudoku[rows+2][col]=temp;//A value stored to C rows
								
								temp= Puzzle[rows][col];//storing A rows into temp
								Puzzle[rows][col]=Puzzle[rows+2][col];//C values into A
								Puzzle[rows+2][col]=temp;//A value stored to C rows
							}
						break;
					}
					}
					largeRow= largeRow+3;
				}
				
				//Scrambling the little columns in the large columns
			int largeCols =0;
				while(largeCols<9) {
					Random smallCol = new Random();
					int smallC = smallCol.nextInt(6);
					switch(smallC) {
					case 0:{ //original:ABC
						break;
					}
					case 1:{ // swap 1, ACB
						int temp;
						int cols =largeCols;
							for(int rows = 0; rows<9; rows++) {
								temp= Sudoku[rows][cols+1];//storing B rows into temp
								Sudoku[rows][cols+1]=Sudoku[rows][cols+2];//C into B
								Sudoku[rows][cols+2]=temp;//B into C
								
								temp= Puzzle[rows][cols+1];//storing B rows into temp
								Puzzle[rows][cols+1]=Puzzle[rows][cols+2];//C into B
								Puzzle[rows][cols+2]=temp;//B into C
							}
						break;
					}
					case 2:{ //swap1,BAC
						int temp;
						int cols =largeCols;
							for(int rows = 0; rows<9; rows++) {
								temp= Sudoku[rows][cols];//storing A rows into temp
								Sudoku[rows][cols]=Sudoku[rows][cols+1];//B into A
								Sudoku[rows][cols+1]=temp;//A into B
								
								temp= Puzzle[rows][cols];//storing A rows into temp
								Puzzle[rows][cols]=Puzzle[rows][cols+1];//B into A
								Puzzle[rows][cols+1]=temp;//A into B
							}
						break;
						
					}
					case 3:{//swap 2,BCA
						int temp;
						int cols =largeCols;
							for(int rows = 0; rows<9; rows++) {
								temp= Sudoku[rows][cols];//storing A rows into temp
								Sudoku[rows][cols]=Sudoku[rows][cols+1];//B into A
								Sudoku[rows][cols+1]=Sudoku[rows][cols+2];//C into B
								Sudoku[rows][cols+2]=temp;//A value stored to C rows
								
								temp= Puzzle[rows][cols];//storing A rows into temp
								Puzzle[rows][cols]=Puzzle[rows][cols+1];//B into A
								Puzzle[rows][cols+1]=Puzzle[rows][cols+2];//C into B
								Puzzle[rows][cols+2]=temp;//A value stored to C rows
							}
						break;
					}
					case 4:{//swap 2,CAB
						int temp;
						int cols =largeCols;
							for(int rows = 0; rows<9; rows++) {
								temp= Sudoku[rows][cols];//storing A rows into temp
								Sudoku[rows][cols]=Sudoku[rows][cols+2];//C values into A
								Sudoku[rows][cols+2]=Sudoku[rows][cols+1];//B values into C
								Sudoku[rows][cols+1]=temp;//A value stored to B rows
								
								temp= Puzzle[rows][cols];//storing A rows into temp
								Puzzle[rows][cols]=Puzzle[rows][cols+2];//C values into A
								Puzzle[rows][cols+2]=Puzzle[rows][cols+1];//B values into C
								Puzzle[rows][cols+1]=temp;//A value stored to B rows
							}
						break;
						
					}
					case 5:{//swap 1, CBA
						int temp;
						int cols =largeCols;
							for(int rows = 0; rows<9; rows++) {
								temp= Sudoku[rows][cols];//storing A rows into temp
								Sudoku[rows][cols]=Sudoku[rows][cols+2];//C values into A
								Sudoku[rows][cols+2]=temp;//A value stored to C rows
								
								temp= Puzzle[rows][cols];//storing A rows into temp
								Puzzle[rows][cols]=Puzzle[rows][cols+2];//C values into A
								Puzzle[rows][cols+2]=temp;//A value stored to C rows
							}
						}
						break;
					}
					
					largeCols=largeCols+3;
				}
				
				//using transpose, rotate etc
				Random r = new Random();
				int f = r.nextInt(2);
				if(f==1) {//transposing
					int[][] sClone = Sudoku.clone();
					for(int row =0; row<Sudoku.length; row++) {
						for(int col =0; col<Sudoku[row].length; col++) {
							Sudoku[row][col]=sClone[col][row];
						}
					}
					}
		}
	public int[][] getPuzzle(){
		return Puzzle;
	}
	public int[][] getSolution(){
		return Sudoku;
	}

}
