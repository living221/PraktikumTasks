package YandexPraktikumTasks.JavaCore1.sprint_1.ClassesAndObjects.task04;

public class Converter {
    double rateUSD = 78.5;
    double rateEUR = 88.7;
    double rateJPY = 0.75;
    //добавьте конструктор здесь


    public Converter(double rateUSD, double rateEUR, double rateJPY) {
        this.rateUSD = rateUSD;
        this.rateEUR = rateEUR;
        this.rateJPY = rateJPY;
    }

    void convert(double rubles, int currency) {
        if (currency == 1) {
            System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
        } else if (currency == 2) {
            System.out.println("Ваши сбережения в евро: " + rubles / rateEUR);
        } else if (currency == 3) {
            System.out.println("Ваши сбережения в иенах: " + rubles / rateJPY);
        } else {
            System.out.println("Неизвестная валюта");
        }
    }
}
