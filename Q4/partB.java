/**
* Identifies and clears an element of puzzle that can be paired with
* the element at the given row and column, as described in part (b)
* Preconditions: row and col are valid row and column indices in puzzle.
* The element at the given row and column is between 1 and 9, inclusive.
*/
public boolean clearPair(int row, int col){
  int key = puzzle[row][col];
  for(int k = row;k<puzzle.length;k++){
    for(int h = 0; h<puzzle[0].length;h++){
      int check = puzzle[k][h];
      if(check==key || check + key == 10){
        puzzle[row][col] = 0;
        puzzle[k][h] = 0;
        return true;
      }
    }
  }
  return false;
}
