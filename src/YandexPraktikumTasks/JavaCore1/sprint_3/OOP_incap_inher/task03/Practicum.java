package YandexPraktikumTasks.JavaCore1.sprint_3.OOP_incap_inher.task03;

public class Practicum {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setMoneyAmount(10000);// передайте в банкомат сумму на счету
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
        bankAccount.withdrawAll(); // вызовите метод вывода средств
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
    }
}

class BankAccount {
    private long moneyAmount;

    public long getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(long moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public void withdrawAll() {
        System.out.println("Со счёта снято " + getMoneyAmount() + " р.");
        setMoneyAmount(0);
    }

    // допишите код методов
    // используйте параметр newMoneyAmount для установки нового значения
}
