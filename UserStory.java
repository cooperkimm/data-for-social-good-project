import java.util.Scanner;

public class UserStory {

/*
* Instance variables
*/
  private clubStats[] stats;

  public UserStory(String leagueNameFile, String clubNamesFile, String goalsAssistsFile, String championsLeagueFile){
    stats = createStats(leagueNameFile, clubNamesFile, goalsAssistsFile, championsLeagueFile);
  }

/*
* File Reader methods also known as Static methods; This goes through all 5 files and gets the league name, goals assists
* club name, and there champions league run.
*/
  public clubStats[] createStats(String leagueNameFile, String clubNamesFile, String goalsAssistsFile, String championsLeagueFile){
    String[] leagueName = FileReader.toStringArray(leagueNameFile);
    String[] clubName = FileReader.toStringArray(clubNamesFile);
    int[] goalsAssists = FileReader.toIntArray(goalsAssistsFile);
    String[] championsLeague = FileReader.toStringArray(championsLeagueFile);

    clubStats[] tempStats = new clubStats[leagueName.length];
/*
* Traverses the tempstats.length which is the league Name array. Temp stats[i] is changed with the league, club, goalsAssists, and champions league
*/
    for (int i = 0; i < tempStats.length; i++) {
      tempStats[i] = new clubStats(leagueName[i], clubName[i], goalsAssists[i], championsLeague[i]);
    }
    return tempStats;
  }

/*
* User input that stores the input of the user after asking the question as "userInput"
*/
  public String promptUser() {
    Scanner input = new Scanner(System.in);
    System.out.println("Premier League" + "\n" + "Bundesliga" + "\n" + "LaLiga" + "\n" + "Serie A" + "\n" + "Ligue 1");
    System.out.println("------------------------------------------");
    String userInput = input.nextLine();
    String coopBaby = findByLeague(userInput);
    input.close();
    return coopBaby;
  }

/*
* Traverses the league 1d array; finds if getLeagus is equal to the League, if so it will print out that ligue, in this case, 
* we want the league that the user inputed to show. For example, if they inputed Premier League, only premier league will be printed.
*/
  public String findByLeague(String league) {
    //Traverse stats
    for (clubStats cs : stats){
    if (cs.getLeagues().equals(league)){
        System.out.println(cs);
    }
  }
    return "";
  }

/*
* Returns the end result by traversing through the clubStats with an enhanced for loop. 
*/
  public String toString() {
    String result = "";

    for (clubStats s : stats) {
      result += s + "\n";
    }
    
    return result;
  }
 

}
