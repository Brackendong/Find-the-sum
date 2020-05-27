/*
* FindTheSums.java
* Author: JiaoAng Dong
* Submission Date: 11/18/2019
*
* Purpose: FindTheSums.java is a class containing 
* 3 methods revolving around the calculation of 2d arrays
* It can return new arrays that has the same dimensions of 
* Original, but calculate the sum and check if it matches with 
* the desired sum, If matched, It will copy the values to the 
* new array
* 
 *
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/

public class FindTheSums {
 
	// convert 2d array a to a type string 
	// return a type string "newstring" that is 
	// a visual representation of the actual array
	
    public static String arrayToString(int[][] a) {
 
        String newstring  = "";
        // big for loop for the rows 
        for (int i = 0; i < a.length; i++)
        {
        	    // nested for loop for the columns 
                for (int j = 0; j < a[i].length; j++)
                {
                   newstring += a[i][j];
                if (j < a[i].length - 1) {
                	newstring += " ";	
                }
        }
                if (i< a.length - 1) {
                	newstring+= "\n";
                }
        }
        return newstring ;
}
    // returns new 2d array, b,  that has the same dimensions of a.
    // if a[i][j] happens to sum up to the HORIZONTAL integer sumToFind , then 
    // we copy that value to b[i][j], otherwise, b[i][j] = 0
    public static int[][] horizontalSums(int [][] a, int sumToFind){
    	int sum = 0;
    	int finalIndex;
    	
    	// create the new array b
    	int[][] b= new int[a.length][a[0].length]; 
    	//loop going through the rows 
    	for (int i = 0; i < a.length; i++) {
    		//loop going through the columns 
    		for (int j = 0; j <a[0].length; j++) {
    			sum=0;
    			// loop to find the sum of of the 1-d array (horizontally)
    			for (int c = j; c < a[0].length; c++)
    			{
    				sum=sum+a[i][c];	
    				// if sum equals int sumToFind 
    				if(sum==sumToFind)
    				{	
    					finalIndex = c;
    					// for loop to copy the values (when sum = sumToFind) on
    					// new array b. otherwise just zero.
    					for (int k = j ;k < finalIndex + 1; k++) {
    						b[i][k]=a[i][k];
    					}
    				}
    			}


    		}
    	}
    	return b;
    }
    // returns new 2d array, b,  that has the same dimensions of a
    // if a[i][j] happens to sum up to the VERTICAL integer sumToFind, then 
    // we copy that value to b[i][j], otherwise, b[i][j] = 0
	public static int[][] verticalSums(int[][] a, int sumToFind){
		int sum = 0;
    	int finalIndex;
    	// initiate new array b 
    	int[][] b= new int[a.length][a[0].length]; 
		//loop going through the columns 
    	for (int j = 0; j <a[0].length; j++) {
        	//loop going through the rows 
    		for (int i = 0; i < a.length; i++) {
    			sum=0;
    			// loop to find the sum of of the 1-d array (vertically)
    			for (int c = j; c < a.length; c++)
    			{
    				sum=sum+a[c][i];	
    				// if sum equals int sumToFind 
    				if(sum==sumToFind)
    				{	
    					finalIndex = c;
    					// for loop to copy the values (when sum = sumToFind) on
    					// new array b. otherwise just zero.
    					for (int k = j ;k < finalIndex + 1; k++) {
    						b[k][i]=a[k][i];
    					}
    				}
    			}


    		}
    	}
    	return b;
    }
}
