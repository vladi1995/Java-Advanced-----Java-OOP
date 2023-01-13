import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        setName(name);
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public void addPlayer(Player player) {
       this.players.add(player);
    }

    public void removePlayer(String playerToRemove) {
        boolean isRemoved = this.players.removeIf(p -> p.getName().equals(playerToRemove));
        if (!isRemoved) {
            throw new IllegalArgumentException("Player " + playerToRemove + " is not in " + this.name + " team.");
        }
    }

    public double getRating() {
        return this.players.stream().mapToDouble(Player::overallSkillLevel).average().orElse(0);
    }
}
