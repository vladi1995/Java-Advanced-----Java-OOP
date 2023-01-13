import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split(";");
        String action = command[0];
        String teamName = command[1];

        Map<String, Team> teams = new LinkedHashMap<>();

            while (!"END".equals(action)) {
                try {
                if ("Team".equals(action)) {
                    Team team = new Team(teamName);
                    teams.put(teamName, team);
                } else if ("Add".equals(action)) {
                    if (teams.containsKey(teamName)) {
                        String playerName = command[2];

                        int endurance = Integer.parseInt(command[3]);
                        int sprint = Integer.parseInt(command[4]);
                        int dribble = Integer.parseInt(command[5]);
                        int passing = Integer.parseInt(command[6]);
                        int shooting = Integer.parseInt(command[7]);

                        Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                        teams.get(teamName).addPlayer(player);
                    } else {
                        System.out.println("Team " + teamName + " does not exist.");
                    }
                } else if ("Remove".equals(action)) {
                    String playerName = command[2];
                    if (teams.containsKey(teamName)) {
                        teams.get(teamName).removePlayer(playerName);
                    } else {
                        System.out.println("Team " + teamName + " does not exist.");
                    }
                } else if ("Rating".equals(action)) {
                    if (teams.containsKey(teamName)) {
                        System.out.println(teamName + " - " + Math.round(teams.get(teamName).getRating()));
                    } else {
                        System.out.println("Team " + teamName + " does not exist.");
                    }
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
                command = scanner.nextLine().split(";");
                action = command[0];
            }
    }
}