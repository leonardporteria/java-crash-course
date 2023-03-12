import java.util.Random;

public class Game {
    static int roundCounter = 1;
    static boolean isSpikePlanted;

    static boolean isSpikeDefused;

    static boolean spikeExploded;
    static Team blueTeam;
    static Team redTeam;


    Game() {
        System.out.println("Game default constructor");
    }

    static void generateBlueTeam(boolean isAttacker) {
        System.out.println("Blue Team Generating");
        blueTeam = new Team("Blue Team", isAttacker);
        blueTeam.generatePlayers("Blue Team");
    }

    static void generateRedTeam(boolean isAttacker) {
        System.out.println("Red Team Generating");
        redTeam = new Team("Red Team", !isAttacker);
        redTeam.generatePlayers("Red Team");
    }

    static void startGame() {
        System.out.println("Match Found");
        // generate a random number [0 || 1]
        // if 0 = blue team will be the attacker
        // if 1 = red team will be the attacker
        boolean isAttacker = new Random().nextInt(2) == 0;

        generateBlueTeam(isAttacker);
        generateRedTeam(isAttacker);

        System.out.println("Loading");

        displayStats();

        if (blueTeam.isAttacker) startRound(blueTeam, redTeam);
        else startRound(redTeam, blueTeam);
    }

    static void startRound(Team attacker, Team defender) {
        // swap atk and def
        if (roundCounter == 13) {
            swapRoles(blueTeam);
            swapRoles(redTeam);
            for (Player player : blueTeam.teamPlayers) player.credits = 200;
            for (Player player : redTeam.teamPlayers) player.credits = 200;
            System.out.println("\nMID ROUND STATS");
            System.out.printf("blue team [%d] / red team [%d]\n", blueTeam.score, redTeam.score);
            displayStats();
        }

        gamePhase(attacker, defender);

        roundCounter++;
        if (blueTeam.score == 13 || redTeam.score == 13) return;
        startRound(attacker, defender);
    }

    static void buyPhase() {
        System.out.println("BUYING LOADOUTS | buy phase\n");
        for (Player player : blueTeam.teamPlayers) {
            int loadoutCost = new Random().nextInt(100);
            player.credits -= loadoutCost;
        }
        for (Player player : redTeam.teamPlayers) {
            int loadoutCost = new Random().nextInt(100);
            player.credits -= loadoutCost;
        }
    }

    static void endPhase() {
        System.out.println("ROUND ENDED | end phase");
    }

    static void gamePhase(Team attacker, Team defender) {
        System.out.println("\n================ ROUND #" + roundCounter+ " ================");
        buyPhase();

        // get spike and set it to random player
        int spikeHolder = new Random().nextInt(5);
        attacker.teamPlayers[spikeHolder].getSpike();

        // generate a random number [0 || 1]
        // if 0 = spike not planted
        // if 1 = spike planted
        isSpikePlanted = new Random().nextInt(2) == 0;
        if (isSpikePlanted) {
            for (Player player : attacker.teamPlayers) {
                if (player.hasSpike) {
                    player.plantSpike();
                }
            }
            postPlantPhase(spikeHolder, attacker, defender);
            return;
        }

        // generate KDA of both teams
        randomizeKDA(attacker);
        randomizeKDA(defender);

        // generate a random winner of wiped out win
        boolean winner = new Random().nextInt(2) == 0;
        if (winner) {
            attacker.score++;
            System.out.println("Wiped Out | Attacker Wins");
        } else {
            defender.score++;
            System.out.println("Wiped Out | Defender Wins");
        }

        // clear spike holder
        blueTeam.teamPlayers[spikeHolder].dropSpike();
        redTeam.teamPlayers[spikeHolder].dropSpike();
        System.out.printf("\nblue team [%d] / red team [%d]\n", blueTeam.score, redTeam.score);
        endPhase();
    }

    static void postPlantPhase(int spikeHolder, Team attacker, Team defender) {
        int defuser = new Random().nextInt(5);
        isSpikeDefused = new Random().nextInt(2) == 0;
        if (isSpikeDefused) {
            defender.teamPlayers[defuser].defuseSpike();
            System.out.println("Spike Defused | Defender Wins");
            defender.score++;

            blueTeam.teamPlayers[spikeHolder].dropSpike();
            redTeam.teamPlayers[spikeHolder].dropSpike();
            System.out.printf("\nblue team [%d] / red team [%d]\n", blueTeam.score, redTeam.score);
            endPhase();
            return;
        }

        spikeExploded = true;
        System.out.println("Spike Exploded | Attacker Wins");
        attacker.score++;

        // generate KDA of both teams
        randomizeKDA(attacker);
        randomizeKDA(defender);

        blueTeam.teamPlayers[spikeHolder].dropSpike();
        redTeam.teamPlayers[spikeHolder].dropSpike();
        System.out.printf("\nblue team [%d] / red team [%d]\n", blueTeam.score, redTeam.score);
        endPhase();
    }

    static void randomizeKDA(Team team) {
        for (Player player : team.teamPlayers) {
            boolean killed = new Random().nextInt(2) == 0;
            boolean died = new Random().nextInt(2) == 0;
            boolean assisted = new Random().nextInt(2) == 0;

            if (killed) player.kills++;
            if (died) player.deaths++;
            if (assisted) player.assists++;

            randomizeCreditsEarned(player);
        }
    }

    static void randomizeCreditsEarned(Player player) {
        int additionalCredit = new Random().nextInt(200);
        player.credits += additionalCredit;
    }


    static void swapRoles(Team team) {
        team.isAttacker = !team.isAttacker;
    }

    static void displayStats() {
        System.out.println("=====================================================");
        System.out.println("BLUE TEAM");
        System.out.printf("%s\n", blueTeam.isAttacker ? "Attacker" : "Defender");
        System.out.println("=====================================================");
        for (Player player : blueTeam.teamPlayers) {
            System.out.println("Player: " + player.username);
            System.out.println("Agent: " + player.agent.agentName);
            System.out.printf("KDA: %s/%s/%s \n", player.kills, player.deaths, player.assists);
            System.out.println("Credits: " + player.credits);
            System.out.println("----------------------------------------------");
        }

        System.out.println("=====================================================");
        System.out.println("RED TEAM");
        System.out.printf("%s\n", redTeam.isAttacker ? "Attacker" : "Defender");
        System.out.println("=====================================================");
        for (Player player : redTeam.teamPlayers) {
            System.out.println("Player: " + player.username);
            System.out.println("Agent: " + player.agent.agentName);
            System.out.printf("KDA: %s/%s/%s \n", player.kills, player.deaths, player.assists);
            System.out.println("Credits: " + player.credits);
            System.out.println("----------------------------------------------");
        }
    }

}
