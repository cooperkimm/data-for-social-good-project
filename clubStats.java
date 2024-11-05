public class clubStats{

  /*
  * Instance Variables; clubs, leagues, goalsAssists, and isChampionsLeague
  */
  private String clubs;
  private String leagues;
  private int goalsAssists;
  private String isChampionsLeague;
  
  /*
  * This is the parameterized constructors that assigns specific values using the "this" word
  */
  public clubStats(String leagues, String clubs, int goalsAssists, String isChampionsLeague){
    this.clubs = clubs;
    this.leagues = leagues;
    this.goalsAssists = goalsAssists;
    this.isChampionsLeague = isChampionsLeague;
  }

  /*
  * These are the getter methods also known as the accessor methods. They get the values of the user and return it. For example, gets name, returns league. 
  */
  public String getClubs(){
    return clubs;
  }

  public String getLeagues() {
    return leagues;
  }

  public int getGoalsAssists(){
    return goalsAssists;
  }
  public String getisChampionsleague(){
    return isChampionsLeague;
  }
  
  /*
  * This is the toString method that returns the information that is necessary.
  */
  public String toString() {
    return "\nLeague: " + leagues + "\nClubs: " + clubs + "\nGoals/Assists: " + goalsAssists + "\nChamps: " + isChampionsLeague;
  }

 
}
