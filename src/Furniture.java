public class Furniture {

    private String couchType;
    private String centerTable;
    private String tvPanel;
    private String daddyChair;

    public Furniture(String couchType, String centerTable, String tvPanel, String daddyChair) {
        this.couchType = couchType;
        this.centerTable = centerTable;
        this.tvPanel = tvPanel;
        this.daddyChair = daddyChair;
    }

    public void getCouchType() {
        System.out.println("Installing my couch " + couchType);
    }

    public void getCenterTable() {
        System.out.println("Installing my center table " + centerTable);
    }

    public void getTvPanel() {
        System.out.println("Installing my tv " + tvPanel);
    }

    public void getDaddyChair() {
        System.out.println("Installing my couch " + daddyChair);
    }
}
