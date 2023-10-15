package chellenge;

public class Wall extends Obstacle{
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.getMaxHeight() > height;
    }

    @Override
    public void printResult(Participant participant) {
        if (overcome(participant)) {
            System.out.println(participant.jump() + height);
        } else {
            System.out.println("Participant " + participant.getName() +
                    " didn't pass the wall at the distance " + height + ".");
            System.out.println("Passed " + participant.getMaxHeight() + ".");
        }
    }
}
