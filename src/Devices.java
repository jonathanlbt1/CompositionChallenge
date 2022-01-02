public class Devices {

    private String TVset;
    private String RadioSystem;
    private String homeTheaterSet;
    private String alexiaDevice;

    public Devices(String TVset, String RadioSystem, String homeTheaterSet, String alexiaDevice) {
        this.TVset = TVset;
        this.RadioSystem = RadioSystem;
        this.homeTheaterSet = homeTheaterSet;
        this.alexiaDevice = alexiaDevice;
    }

    public void getTVset() {
        System.out.println("Installing my TV Set " + TVset);

    }

    public void getRadioSystem() {
        System.out.println("Insllaling Radio System brand " + RadioSystem);
    }

    public void getHomeTheaterSet() {
        System.out.println("Installing home theater " + homeTheaterSet);
    }

    public void getAlexiaDevice() {
        System.out.println("configuring Alexia type " + alexiaDevice);;
    }
}
