package lesson1HW1;

public class Main {
    public static void main(String[] args) {


        Treadmill [] treadmills = {
                new Treadmill(5),
                new Treadmill(50),
                new Treadmill(5000)
        };

        Well [] wells = {
                new Well(2),
                new Well(15),
                new Well(35)
        };

        Obstaclable [] participants = {
                new Man("Джон", 2000, 1),
                new Cat("Barsik", 10, 20),
                new Robot("Archi", 7000, 40)
        };

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < treadmills.length && j< wells.length; j++) {
                participants[i].obstacle(treadmills[j].getDistance(), wells[j].getHeightWall());
            }
        }
    }
}
