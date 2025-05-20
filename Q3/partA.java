/** Initializes competitorList, as described in part (a) */
public Round(String[] names){
  competitorList = new ArrayList<Competitor>();
  for(int rank = 0; rank<names.length; rank++){
    competitorList.add(new Competitor(names[rank],rank+1));
  }
}
