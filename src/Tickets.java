public class Tickets {
    private int cost;
    private boolean isVIP;

    public Tickets(){

    }
    public Tickets(int cost, boolean isVIP) {
        this.cost = cost;
        this.isVIP = isVIP;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isVIP() {
        return isVIP;
    }

    public void setVIP(boolean VIP) {
        isVIP = VIP;
    }


}
