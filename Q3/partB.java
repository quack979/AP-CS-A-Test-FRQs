/**
* Creates an ArrayList of Match objects for the next round
* of the tournament, as described in part (b)
* Preconditions: competitorList contains at least one element.
* competitorList is ordered from best to worst rank.
* Postcondition: competitorList is unchanged.
*/
public ArrayList<Match> buildMatches(){
  int index = 0;
  ArrayList<Match> matches = new ArrayList<Match>();
  if(competitorList.size()%2==1){
    index=1;
  }
  for(int i = index; i< size/2;i++){
    Match temp = new Match(competitorList.get(index),competitorList.get(competitorList.size()-index-1));
    matches.add(temp);
  }
  return matches;
}
