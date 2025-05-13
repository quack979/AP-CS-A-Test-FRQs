public class DogWalkCompany
{
/**
* Returns the number of dogs, always greater than 0, that are available
* for a walk during the time specified by hour
* Precondition: 0 <= hour <= 23
*/
public int numAvailableDogs(int hour)
{ /* implementation not shown */ }

/**
* Decreases, by numberDogsWalked, the number of dogs available for a walk
* during the time specified by hour
* Preconditions: 0 <= hour <= 23
* numberDogsWalked > 0
*/
public void updateDogs(int hour, int numberDogsWalked)
{ /* implementation not shown */ }

/* There may be instance variables, constructors,
and methods that are not shown. */
}

public class DogWalker
{
/** The maximum number of dogs this walker can walk simultaneously
per hour */
private int maxDogs;

/** The dog-walking company this dog walker is associated with */
private DogWalkCompany company;

/**
* Assigns max to maxDogs and comp to company
* Precondition: max > 0
*/
public DogWalker(int max, DogWalkCompany comp)
{ /* implementation not shown */ }

/**
* Takes at least one dog for a walk during the time specified by
* hour, as described in part (a)
* Preconditions: 0 <= hour <= 23
* maxDogs > 0
*/
public int walkDogs(int hour)
{ /* to be implemented in part (a) */ }
/**
* Performs an entire dog-walking shift and returns the amount
* earned, in dollars, as described in part (b)
* Preconditions: 0 <= startHour <= endHour <= 23
* maxDogs > 0
*/
public int dogWalkShift(int startHour, int endHour)
{ /* to be implemented in part (b) */ }

/* There may be instance variables, constructors,
and methods that are not shown. */
}
