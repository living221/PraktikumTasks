package YandexPraktikumTasks.JavaCore1.Sprint_2.Types.task04;

class Resources {
    long gold;
    byte silver;
    short wood;
    long health;
    boolean hasHelper;

    public Resources(
            long inputGold,
            byte inputSilver,
            short inputWood,
            long inputHealth,
            boolean inputHasHelper
    ) {
        gold = inputGold;
        silver = inputSilver;
        wood = inputWood;
        health = inputHealth;
        hasHelper = inputHasHelper;
    }
}
