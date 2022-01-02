public class Installations {

    private int numberOfOutlets;
    private int numberOfLightBulbs;
    private String cableTV;

    public Installations(int numberOfOutlets, int numberOfLightBulbs, String cableTV) {
        this.numberOfOutlets = numberOfOutlets;
        this.numberOfLightBulbs = numberOfLightBulbs;
        this.cableTV = cableTV;
    }

    public void getNumberOfOutlets() {
        System.out.println("Installing " + numberOfOutlets + " outlets");
    }

    public void getNumberOfLightBulbs() {
        System.out.println("Installing " + numberOfLightBulbs + " light bulbs");
    }

    public void getCableTV() {
        System.out.println("Installing my cable tv " + cableTV);
    }
}
