import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

   /*
   * Instantiate the UserStory and object with the leagueName, clubName, goalsAssists, and championsLeague text files.
   */
   UserStory leagues = new UserStory("leagueName.txt", "clubNames.txt", "goalsAssists.txt", "championsLeague.txt");

  
   /*
   * Print out introduction and finally promptUser
   */
   System.out.println("Hello! Welcome to the Community of Emerging Sports Analysts!!");
   System.out.println("We are a platform that provides various statistics of different soccer teams!" + "\n");
   System.out.println("------------------------------------------");
   System.out.println(leagues.promptUser());

   
    
    
  }
}
