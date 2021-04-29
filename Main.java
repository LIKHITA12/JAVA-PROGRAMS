/******************************************************************************
JAVA PROGRAM TO FIND THE GIVEN MATRICES ARE TOEPLITZ MATRIX
*******************************************************************************/

public class Main
{   
    public boolean isToeplitzMatrix(int [][] matrix){
        
        for(int i=0; i<matrix.length-1; i++){
            
            for (int j=0; j<matrix[i].length-1; j++){
                
                if(matrix[i][j] != matrix[i+1][j+1])
                    
                    return false;
            }
        }
        
        return true;
        
    }
    
    public static void printMatrix(int[][] matrix){
        
        for(int[] i : matrix){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
	public static void main(String[] args) {
	    
	    Main tm = new Main();
	    
		int[][] testCase1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] testCase2 = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
		
		System.out.println("Testcase 1:");
		printMatrix(testCase1);
		System.out.println("Check the Testcase-1 is Toeplitz Matrix : "+ tm.isToeplitzMatrix(testCase1));
		
		System.out.println("\nTestcase 2:");
		printMatrix(testCase2);
		System.out.println("Check the Testcase-2 is Toeplitz Matrix : "+ tm.isToeplitzMatrix(testCase2));
		
	}
}

/******************************************************************************
OUTPUT:

Testcase 1:                                                                                                             
1 2 3                                                                                                                   
4 5 6                                                                                                                   
7 8 9                                                                                                                   
Check the Testcase-1 is Toeplitz Matrix : false                                                                         
                                                                                                                        
Testcase 2:                                                                                                             
1 2 3 4                                                                                                                 
5 1 2 3                                                                                                                 
9 5 1 2                                                                                                                 
Check the Testcase-2 is Toeplitz Matrix : true

*******************************************************************************/
