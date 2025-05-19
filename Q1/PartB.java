/**
* Performs an entire dog-walking shift and returns the amount
* earned, in dollars, as described in part (b)
* Preconditions: 0 <= startHour <= endHour <= 23
* maxDogs > 0
*/
public int dogWalkShift(int startHour, int endHour){
  int total = 0;
  for(int i = startHour;i<=endHour;i++){
    
    int dogsWalked = walkDogs(i);
    
    total= total+(dogsWalked)*5;
    
    if (dagsWalked == maxDogs || (9<=i && i<=17)){
      total= total+3;
    }
  }
  return total;
 }
