public class Main {
    public static void main(String[] args) {

    Devices devices = new Devices("LG 50 inch", "Sony Blast", "Samsung Theater", "2022 Alexia Dot");
    Furniture furniture = new Furniture("3 Foldable couches", "wood & glass board", "wooded panel", "Comfy chair");
    Installations installations = new Installations(8, 3, "Sky");
    Room room = new Room(devices, furniture, installations);

    room.myLivingRoom();






    }

    /*
    INSTRUCTIONS:
    Create a single room of a house using composition.
    Think about the things that should be included in the room.
    Maybe physical parts of the house furniture as well
    Add at least one method to access an object via a getter and then that objects public method as you saw in the previous
    video then add at least one method to hide the object e.g. not using a getter but to access the object used in composition within the main
    class like you saw in this video.
     */
}
