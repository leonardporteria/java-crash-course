import java.util.Scanner;

public class Team {
    String team;
    int score;
    String[] chosenAgents = new String[5];
    int teamCredits;
    boolean isAttacker;
    Player[] teamPlayers = new Player[5];
    Scanner scanner = new Scanner(System.in);

    Team() {
        System.out.println("Team default constructor");
    }

    Team(String team, boolean isAttacker) {
        this.team = team;
        this.isAttacker = isAttacker;
    }

    void generatePlayers(String team) {
        System.out.println(team + " Selecting Agents");
        for (int i = 0; i < 5; i++) {
            System.out.println(team + " Player " + (i + 1) + " selecting");
            System.out.print("Enter Username: ");
            String username = scanner.next().trim();
            teamPlayers[i] = new Player(username);
            selectAgent(i);
        }
    }

    void selectAgent(int playerIndex) {
        PlayableAgents PLAYABLE_AGENTS = new PlayableAgents();

        // get chosen agent
        System.out.print("Choose your Agent [" + teamPlayers[playerIndex].username + "]: ");
        String currentAgent = scanner.next().toLowerCase().trim();

        // check if the agent is already chosen
        for (String chosenAgent : chosenAgents) {
            if (currentAgent.equals(chosenAgent)) {
                System.out.printf("\nAGENT %s ALREADY CHOSEN\n\n", currentAgent.toUpperCase());
                selectAgent(playerIndex);
                break;
            }
        }

        // check if agent is one of the playable agent
        if (!isValidAgent(currentAgent)) {
            System.out.println("\nINVALID AGENT\n");
            selectAgent(playerIndex);
            return;
        }
        // create the agent
        chosenAgents[playerIndex] = currentAgent;
        teamPlayers[playerIndex].agent = new Agent(
                PLAYABLE_AGENTS.getAgentDetails(currentAgent).agentName,
                PLAYABLE_AGENTS.getAgentDetails(currentAgent).orbCount,
                PLAYABLE_AGENTS.getAgentDetails(currentAgent).skills
        );
    }

    void closeScanner() {
        scanner.close();
    }

    boolean isValidAgent(String chosenAgent) {
        return switch (chosenAgent) {
            case "brimstone", "phoenix", "sage", "sova", "viper", "cypher", "reyna", "killjoy", "breach", "omen", "jett", "raze", "skye" ->
                    true;
            default -> false;
        };
    }


}
