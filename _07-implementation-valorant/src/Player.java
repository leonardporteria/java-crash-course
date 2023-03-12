public class Player {

    String username;
    int credits = 200;
    boolean hasSpike;

    int kills;
    int deaths;
    int assists;

    Agent agent;

    Player(String username){
        this.username = username;
    }


    void purchaseArmor(){}

    void purchaseWeapon(){}

    void purchaseSkill(){}

    void getSpike(){
        this.hasSpike = true;
    }

    void dropSpike(){
        this.hasSpike = false;
    }

    void plantSpike() {
        if (this.hasSpike) {
            System.out.println(this.username + " is Planting the Spike");
            Game.isSpikePlanted = true;
            System.out.println("Spike Planted");
        }
    }

    void defuseSpike() {
        System.out.println(this.username + " is Defusing the Spike");
        Game.isSpikePlanted = false;
    }
}
