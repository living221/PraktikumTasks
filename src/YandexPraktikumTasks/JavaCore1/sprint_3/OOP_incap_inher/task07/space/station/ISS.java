package YandexPraktikumTasks.JavaCore1.sprint_3.OOP_incap_inher.task07.space.station;

class ISS extends Zarya {
    // доступ к изменению параметров запрещён
    public ISS(double initialOxygenLevel, double initialEnergyLevel, double initialFuel) {
        super(initialOxygenLevel, initialEnergyLevel);
        // требуется увеличить уровень кислорода и энергетических резервов
//        oxygenLevel = initialOxygenLevel;
//        energyReserve = initialEnergyLevel;
        oxygenLevel = super.getOxygenLevel();
        energyReserve = super.getEnergyReserve();

        // доступ к изменению полей запрещён
        fuel = initialFuel;
        vibration = 0;
        energyConsumption = 20;
    }

    // доступ к изменению метода запрещён
    public void moduleDocking(Zvezda module) {
        connectEnergyCableTo(module);
        connectOxygenCableTo(module);
        stabilize();
    }

    // получен доступ к переопределению метода стабилизации


    @Override
    void stabilize() {
        super.stabilizeBySmallEngines();
        super.stabilizeBySmallEngines();
        super.stabilizeBySmallEngines();
    }

    // доступ к изменению метода запрещён
    private void connectOxygenCableTo(Zvezda module) {
        double oxygenLosses = (oxygenLevel + module.oxygenLevel) / 2 + 9;
        oxygenLevel -= oxygenLosses;
        vibration += 2;
    }

    // доступ к изменению метода запрещён
    private void connectEnergyCableTo(Zvezda module) {
        energyReserve += module.getEnergyReserve();
        energyConsumption += module.getEnergyConsumption() * 1.3;
        vibration += 2;
    }
}
