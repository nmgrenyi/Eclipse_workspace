public class D
{

	public static void printdial(int[][] matrix){
		if(matrix==null || matrix.length==0 || matrix[0].length==0){
			return;
	}
		int row = matrix.length;
		int col = matrix[0].length;

		//print up left big trangle
		for(int i=0; i<row;i++){
	int j = 0;
	while(i>=0 && i<row && j>=0 && j<col ){
		System.out.print(matrix[i][j]);
		i--;
		j++;
	}		
	}
		
		//print bottom right small trangle
		for(int j=1;j<col;j++){
			int i = row - 1;
			while(i>=0 && i<row && j>=0 && j<col ){
		System.out.print(matrix[i][j]);
		i--;
		j++;
	}		
	}
	}
	
	public static void main (String args[])
	{
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
		
		printdial(array);
	}

}