public class Room {

    private Devices devices;
    private Furniture furniture;
    private Installations installations;

    public Room(Devices devices, Furniture furniture, Installations installations) {
        this.devices = devices;
        this.furniture = furniture;
        this.installations = installations;
    }

    public void preparations() {
        installations.getNumberOfOutlets();
        installations.getNumberOfOutlets();
        installations.getCableTV();
        furniture.getCenterTable();
        furniture.getCouchType();
        furniture.getDaddyChair();
        furniture.getTvPanel();

    }

    public void myLivingRoom() {
        preparations();
        devices.getAlexiaDevice();
        devices.getHomeTheaterSet();
        devices.getRadioSystem();
        devices.getTVset();
    }





}
