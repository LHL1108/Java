public class Mytest03{
	public static boolean find(int[][] matrix, int number) {
		if(matrix == null || matrix.length < 1 || matrix[1].length < 1) {
			return false;
		}
		int rows = matrix.length;
		int cols = matrix[1].length;
		
		int row = 0;
		int col = cols - 1;
		
		while(row >= 0 && row < rows && col >= 0 && col < cols) {
			if(matrix[row][col] == number) {
				return true;
			}else if(matrix[row][col] > number) {
				col--;
			}else if(matrix[row][col] < number) {
				row++;
			}
		}
		return false;
	}
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };
        System.out.println(find(matrix, 7));   
        System.out.println(find(matrix, 5));    
        System.out.println(find(matrix, 1));    
        System.out.println(find(matrix, 15));  
        System.out.println(find(matrix, 0));    
        System.out.println(find(matrix, 16));   
        System.out.println(find(null, 16));     
    }
}
