public class PlayableAgents {

    private Agent brimstone = new Agent(
            "Brimstone",
            7,
            new String[]{"Incendiary", "Stim Beacon", "Sky Smoke", "Orbital Strike"}
    );
    private Agent phoenix = new Agent(
            "Phoenix",
            6,
            new String[]{"Blaze", "Curveball", "Hot Hands", "Run it Back"});
    private Agent sage = new Agent(
            "Sage",
            8,
            new String[]{"Barrier Orb", "Slow Orb", "Healing Orb", "Resurrection"});
    private Agent sova = new Agent(
            "Sova",
            7,
            new String[]{"Incindiary", "Stim Beacon", "Sky Smoke", "Orbital Strike"});
    private Agent viper = new Agent(
            "Viper",
            8,
            new String[]{"Snake Bite", "Poison Cloud", "Toxic Screen", "Viper's Pit"});
    private Agent cypher = new Agent(
            "Cypher",
            6,
            new String[]{"Trapwire", "Cypher Cage", "Spycam", "Neutral Theft"});
    private Agent reyna = new Agent(
            "Reyna",
            6,
            new String[]{"Leer", "Devour", "Dismiss", "Empress"});
    private Agent killjoy = new Agent(
            "Killjoy",
            8,
            new String[]{"Alarmbot", "Nanoswarm", "Turret", "Lockdown"});
    private Agent breach = new Agent(
            "Breach",
            8,
            new String[]{"Aftershock", "Flashpoint", "Fault Line", "Rolling Thunder"});
    private Agent omen = new Agent(
            "Omen",
            7,
            new String[]{"Shrouded Step", "Paranoia", "Dark Cover", "From the Shadows"});
    private Agent jett = new Agent(
            "Jett",
            7,
            new String[]{"Cloudburst", "Updraft", "Tailwind", "Blade Storm"});
    private Agent raze = new Agent(
            "Raze",
            8,
            new String[]{"Boom Bot", "Blast Pack", "Paint Shells", "Showstopper"});
    private Agent skye = new Agent(
            "Skye",
            7,
            new String[]{"Regrowth", "Trailblazer", "Guiding Light", "Seekers"});


    Agent getAgentDetails(String chosenAgent) {
        if (chosenAgent.equals("brimstone")) return brimstone;
        if (chosenAgent.equals("phoenix")) return phoenix;
        if (chosenAgent.equals("sage")) return sage;
        if (chosenAgent.equals("sova")) return sova;
        if (chosenAgent.equals("viper")) return viper;
        if (chosenAgent.equals("cypher")) return cypher;
        if (chosenAgent.equals("reyna")) return reyna;
        if (chosenAgent.equals("killjoy")) return killjoy;
        if (chosenAgent.equals("breach")) return breach;
        if (chosenAgent.equals("omen")) return omen;
        if (chosenAgent.equals("jett")) return jett;
        if (chosenAgent.equals("raze")) return raze;
        if (chosenAgent.equals("skye")) return skye;

        return new Agent();
    }


}
