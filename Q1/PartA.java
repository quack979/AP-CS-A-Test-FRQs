//part A
Public static 
  /**
* Takes at least one dog for a walk during the time specified by
* hour, as described in part (a)
* Preconditions: 0 <= hour <= 23
* maxDogs > 0
*/
public int walkDogs(int hour){
   if(numAvailableDogs(hour)>=maxDogs){
     updateDogs(hour, maxDogs);
     return (int)(maxDogs);
   }
   else{
     updateDogs(hour,numAvailableDogs(hour));
     return (int)(numAvailableDogs(hour));
   }
}
