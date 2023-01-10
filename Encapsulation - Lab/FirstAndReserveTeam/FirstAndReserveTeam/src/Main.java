public class Main {
    public static void main(String[] args) {
        Team team = new Team("Black Eagles");
        Person person1 = new Person("Vladislav", "Dimitrov", 27, 1200);
        Person person2 = new Person("Vladislav", "Dimitrov 2", 45, 1200);
        team.addPlayer(person1);
        team.addPlayer(person2);
        System.out.println(team.getFirstTeam().size());
        System.out.println(team.getReserveTeam().size());

    }
}