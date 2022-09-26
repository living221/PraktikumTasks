package YandexPraktikumTasks.JavaCore1.sprint_3.OOP_incap_inher.task07.space.station;

class Zvezda extends Zarya {

    public Zvezda() { // доступ к изменению конструктора запрещён
        super();
        energyConsumption = 44;
        activateModule();
    }

    @Override
    void activateModule() {
        super.turnSolarPanels();
    }

    // доступ к созданию новых конструкторов запрещён

    // разрешено переопределение методов
}