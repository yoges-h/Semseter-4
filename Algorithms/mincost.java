import java.util.Scanner;

// A dynamic Programming Approch to solve the problem


public class mincost
{

  /// Here A is an integer From One point to Another Point 

  public static int find(int[][] A)
  { 
  
  int[][] sol = new int [A.length][A.length];

  sol[0][0] = A[0][0];
  /**
   *If you want to Stay at same point 
   * that means there will be a loop
   * from the same point to same point */

  for(int i=0;i<A.length;i++)
  {
  	sol[0][i] = A[0][i] + sol[0][i-1];
  	/**we are going in the same row
  	* and we are checking 
  	* the Distance in same Row 
  	*/

  }


  for(int  i=1;i<A.length;i++)
  {

  	sol[i][0] = A[i][0] + sol[i-1][0];
  	/* we are going in the same column
  	* and we are checking 
  	* the Distance in same column 
  	*/
  }
   for(int i=0;i<A.length;i++)
  {
	for(int j=0;i<A.length;j++)
	{

		sol[i][j] = A[i][j] + Math.min(sol[i-1][j],sol[i][j-1]);
	}

  }

  return sol[A.length-1][A.length-1];

 }



   public static void main(String args[]){

    Scanner input = new Scanner(System.in);
        
        System.out.println(" Input the number of elements in row");
		int m = input.nextInt();
		System.out.println(" Input the number of elements in cloumn");
		int n = input.nextInt();

		System.out.println(" Number of elements in array is"+n);
		
          int [][] A;
          A  = new int[100][100];

		for(int i=0;i<m;i++)
		{    

		for(int j=0;j<n;j++)
		{

			 System.out.println(" Element "+i+":"+j+" is");
			 A[i][j] = input.nextInt();
		}

	}
  
	  for(int i=0;i<m;i++)
		{    

		for(int j=0;j<n;j++)
		{
        System.out.println("Array : "+A[i][j]);

        }
       }
      System.out.println(" Min Cost Path : "+find(A));
   }
}