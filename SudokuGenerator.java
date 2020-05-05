import java.util.Random;

public class SudokuGenerator {
	private int[][] Sudoku = new int [9][9];
	private int[][] Puzzle = new int[9][9];
	private int[][] Error = new int [27][4];
	
	public SudokuGenerator(){		
		Random r = new Random();
		int start = r.nextInt(8)+1;
		int value = start;//start value is preserved so we can use it later
		int count = 0;
		for (int row = 0; row<9; row++) {
			if(row < 8) {
				count = (row*3)%8;
			}
			else {
				count = 8;
			}
			for (int col = 0; col<9; col++) {
					Sudoku[row][count] = value;
					if (value<9) {
						value++;
					}
					else {
						value =1;
					}
					if (count>=8) {
						count = 0;
					}
					else {
						count++;
					}
			}
		value = start;
		}
		
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
						}
					}
					break;
				}
				
				largeCols=largeCols+3;
			}
			
			//using transpose, rotate etc

				
				
				}
			
		

	public int[][] getSudokuGenerated(int[][]Sudoku){
		for(int row =0; row<Sudoku.length;row++) {
			for(int col =0; col<Sudoku[row].length; col++) {
				Sudoku[row][col]= this.Sudoku[row][col];
			}

		}
		return Sudoku;
	}
	public int[][] sudokuPuzzle(int level){//level 1 for easy, 2 for medium, and 3 for hard;
		Puzzle = Sudoku.clone();
			int row =0;
			int col =0;
			int blanks = level*2;
			Random loopr = new Random();
			while(row<9) {
				while(col<9) {
					int loop2 = loopr.nextInt(blanks) + 1;
					for(int loop =0; loop<loop2;loop++) {
					Random coor = new Random();
					int x = coor.nextInt(3);
					int y = coor.nextInt(3);
					if(Puzzle[row+x][col+y]!=0) {
						Puzzle[row+x][col+y]=0;
					}
					}
					col=col+3;
				}
				row = row+3;
				col=0;
			}
		return Puzzle;
		}
	
		public boolean checkValidSudoku(int[][]s) {//here the s mean the puzzle that the users has inputed
			boolean result = true;
			boolean original = true;
			boolean noValue = false;
			int x =0;
			int y =0;//coordinates for the error matrix so we can check for duplicate errors
			//null checkers
			for(int row =0; row < 9; row++) {
				for(int col =0; col < 9; col++) {
					if(s[row][col]<1 || s[row][col]>9) {
						result = false;
						noValue = true;
					}
				}
				if(noValue == false) {
					break;
			}
			}
			if(noValue == false) {
			//now checking if it is the same as our original solution
			for(int rows=0; rows < 9; rows++) {
				for(int col =0; col < 9; col++) {
					if(s[rows][col]!=Sudoku[rows][col]) {
						original = false;
						break;
					}
					}
				if(original ==false) {
					break;
				}
			}
			
			if(original == false) {
			// row checker
			for(int row1 = 0; row1 < 9; row1++) {
			   for(int col = 0; col < 8; col++) {
			      for(int col2 = col + 1; col2 < 9; col2++) {
			         if(s[row1][col]==s[row1][col2]) {
			            result = false;
			           Error[x][y]= row1; y++;
			           Error[x][y]=col;y++;
			           Error[x][y]= row1; y++;
			           Error[x][y]=col2;
			           x++; y=0;//putting the values in this formate [original x][original y][duplicate x][duplicate y]
			         }
			      }
			   }
			}

			// column checker
			for(int col = 0; col < 9; col++) {
			   for(int row3 = 0; row3 < 8; row3++) {
			      for(int row2 = row3 + 1; row2 < 9; row2++) {
			         if(s[row3][col]==s[row2][col]) {
			            result = false;
				           Error[x][y]= row3; y++;
				           Error[x][y]=col;y++;
				           Error[x][y]= row2; y++;
				           Error[x][y]=col;
				           x++; y=0;
			         }
			      }
			   }
			}

			// grid checker
			for(int row4 = 0; row4 < 9; row4 += 3) {
			   for(int col = 0; col < 9; col += 3) {
			      // row, col is start of the 3 by 3 grid
			      for(int pos = 0; pos < 8; pos++) {
			         for(int pos2 = pos + 1; pos2 < 9; pos2++) {
			            if(s[row4 + pos%3][col + pos/3]==s[row4 + pos2%3][col + pos2/3])
			               result= false;
				           Error[x][y]= row4 + pos%3; y++;
				           Error[x][y]=col + pos/3;y++;
				           Error[x][y]= row4 + pos2%3; y++;
				           Error[x][y]=col + pos2/3;
				           x++; y=0;
			         }
			      }
			   }
			}
			}
			}
			return result;
		}
		public int[][] getErrorLocation(int[][] ErrorInput){
			for (int row =0 ; row < Error.length; row++) {
				for(int col=0; col<Error[row].length; col++) {
					ErrorInput[row][col]= Error[row][col];
					}
			}
			return ErrorInput;
		}
		}

		
		
	
		
	



