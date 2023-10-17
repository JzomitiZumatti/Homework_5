package chellenge;

public class Racetrack extends Obstacle{
    private final int length;

    public Racetrack(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.getMaxLength() > length;
    }

    @Override
    public void printResult(Participant participant) {
        if (overcome(participant)) {
            System.out.println(participant.run() + length);
        } else {
            System.out.println("Participant " + participant.getName() +
                    " didn't pass the racetrack at the distance " + length + ".");
            System.out.println("Passed " + participant.getMaxLength() + ".");
        }
    }
}
