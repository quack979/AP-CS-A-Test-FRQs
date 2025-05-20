/**
* Creates a two-dimensional array and fills it with random integers,
* as described in part (a)
* Precondition: numRows > 0; numCols > 0
*/
public SumOrSameGame(int numRows, int numCols){
  puzzle= new int[numRows][numCols];
  for(int k = 0; k<numRows; k++){
    for)(int h = 0; h < numCols; h++){
      puzzle[k][h]=(int)(Math.random()*9)+1;
    }
  }
}
