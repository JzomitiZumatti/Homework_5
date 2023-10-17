package chellenge;

public class Participant {
    private final int maxLength;
    private final int maxHeight;
    private final String name;

    public Participant(int maxLength, int maxHeight, String name) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
        this.name = name;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public String getName() {
        return name;
    }

    public String run(){
        return "Participant " + name + " passed the racetrack at the distance ";
    }
    public String jump(){
        return "Participant " + name + " passed the wall at the distance ";
    }
}
