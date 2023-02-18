
public class CompetitionGameMain {

    public static void main(String[] args) {

        Obstacle[] obstacles = createObstacles();
        Participant[] participants = createParticipants();
        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                // participant.overcome(obstacle)
                // obstacle.pass(participant)
                boolean result = obstacle.pass(participant);
                if (result) {
                    System.out.println("Участник #" + participant.getName() + " преодолел препятствие");
                } else {
                    System.out.println("Участник #" + participant.getName() + " НЕ преодолел препятствие");
                }
            }
        }

        // Homework!!!
        // 0. Ознакомиться с кодом урока 2, подготовить вопросы к следующему уроку!
        // 1. Дописать адаптеры для бассейна
        // 2. *Придумать собственный тип препятствий и прикрутить его в проект по
        // аналогии/

        // 3. *Есть интерфейс RoundHole - описание круглое отверстия (имеет радиус)
        // double getRadius()
        // Есть интерфейс RoundPeg - описание круглого колышка (тоже есть радиус)
        // Есть класс RoundHoleMachine, у которой метод, принмает RoundPeg, возвращает
        // RoundHole
        // Есть интерфейс SquarePeg - описание квадратного колышка (имеет длину стороны
        // кварата)
        // Реализовать адаптер для SquarePeg в RoundHoleMachine
    }

    private static Obstacle[] createObstacles() {
        return new Obstacle[] {
                new WallObstacleAdapter(new Wall(40)),
                new RoadObstacleAdapter(new Road(100)),
                new RoadObstacleAdapter(new Road(45)),
                new SwimmingObstacleAdapter(new SwimmingPoll(30)),
                new BenchPressObstacleAdapter(new BenchPress(120))
        };
    }

    private static Participant[] createParticipants() {
        return new Participant[] {
                new StandardParticipant("Igor", 50, 50, 35, 110),
                new Cat("Murzik", 60, 25),
                new Cheater("Cheater")
        };
    }

};
