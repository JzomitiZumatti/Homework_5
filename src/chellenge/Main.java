package chellenge;

public class Main {
    public static void main(String[] args) {

        Participant[] participants = new Participant[3];
        Obstacle[] obstacles = new Obstacle[5];

        participants[0] = new Participant(20, 4, "human");
        participants[1] = new Participant(35, 7, "cat");
        participants[2] = new Participant(101, 10, "robot");

        obstacles[0] = new Wall(3);
        obstacles[1] = new Racetrack(34);
        obstacles[2] = new Wall(8);
        obstacles[3] = new Wall(1);
        obstacles[4] = new Racetrack(50);


        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle.overcome(participant)) {
                    obstacle.printResult(participant);
                } else {
                    obstacle.printResult(participant);
                    break;
                }
            }
        }
    }
}
