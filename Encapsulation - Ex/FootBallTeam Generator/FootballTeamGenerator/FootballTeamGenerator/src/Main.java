import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] commands = scanner.nextLine().split(";");
        String action = commands[0];
        Map<String, Team> mapOfPlayers = new HashMap<>();

        while (!action.equals("END")) {
            try {
                String teamName = commands[1];
                if (action.equals("Team")) {
                    Team team = new Team(teamName);
                    mapOfPlayers.put(teamName, team);
                } else if (action.equals("Add")) {
                    if (mapOfPlayers.containsKey(teamName)) {
                        String playerName = commands[2];

                        int endurance = Integer.parseInt(commands[3]);
                        int sprint = Integer.parseInt(commands[4]);
                        int dribble = Integer.parseInt(commands[5]);
                        int passing = Integer.parseInt(commands[6]);
                        int shooting = Integer.parseInt(commands[7]);

                        Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                        mapOfPlayers.get(teamName).addPlayer(player);
                    } else {
                        System.out.println("Team " + teamName + " does not exist.");
                    }
                } else if (action.equals("Remove")) {
                    String playerName = commands[2];
                    if (mapOfPlayers.containsKey(teamName)) {
                        mapOfPlayers.get(teamName).removePlayer(playerName);
                    } else {
                        System.out.println("Player " + playerName + " is not in " + teamName + " team.");
                    }
                } else if (action.equals("Rating")) {
                    if (mapOfPlayers.containsKey(teamName)) {
                        System.out.println(teamName + " - " + Math.round(mapOfPlayers.get(teamName).getRating()));
                    } else {
                        System.out.println("Team " + teamName + " does not exist.");
                    }
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
            commands = scanner.nextLine().split(";");
            action = commands[0];
            }
    }
}