package YandexPraktikumTasks.JavaCore1.sprint_3.OOP_incap_inher.task06.auto;

class Tezla extends Automobile {
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public Tezla() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 11;
    }

    public void accelerateByAutopilot() {
        if (speed < autoPilotMaxSpeed) {
            speed += autoPilotAcceleration;
        } else {
            speed = autoPilotMaxSpeed;
        }
        // исправьте метод для ускорения при автопилоте
    }

    @Override
    public void accelerate() {

        if (speed < maxSpeed) {
            speed += acceleration;
        } else {
            speed = maxSpeed;
        }

    }

    @Override
    public void brake() {

        if (speed > 0) {
            speed -= brakingSpeed;
            if (speed < 0) {
                speed = 0;
            }
        } else {
            speed = 0;
        }
    }
}
