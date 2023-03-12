public class Agent {
    String agentName;
    int orbCount;
    String[] skills = new String[4];

    Agent() {
        System.out.println("Agent Default Parameter");
    }

    Agent(String agentName, int orbCount, String[] skills) {
        this.agentName = agentName;
        this.orbCount = orbCount;
        this.skills[0] = skills[0];
        this.skills[1] = skills[1];
        this.skills[2] = skills[2];
        this.skills[3] = skills[3];
    }

    void run(){}

    void walk(){}

    void aimDownSight(){}

    void equip(){}
}
