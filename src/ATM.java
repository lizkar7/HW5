public class ATM {
    int banknote20;
    int banknote50;
    int banknote100;

    ATM(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    //Добавление денег в банкомат
    public void addmAmountATM(int add20, int add50, int add100) {
        if (add20 >= 0 && add50 >= 0 && add100 >= 0) {
            banknote20 += add20;
            banknote50 += add50;
            banknote100 += add100;
            int sum = add20 * 20 + add50 * 50 + add100 * 100;
            System.out.println("на счет успешно добавленно: " + sum + "руб.");
        } else {
            System.out.println("Ошибка: на счет не может быть добавлено отрицательного количества купюр.");
        }
    }

    // Снятее денег
    /*boolean deleteAmountATM(int amount) {
        int needAmoutnt = amount;

        int needed100 = Math.min(amount / 100, banknote100);
        amount -= needed100 * 100;
        int needed50 = Math.min(amount / 50, banknote50);
        amount -= needed50 * 50;
        int needed20 = Math.min(amount / 20, banknote20);
        amount -= needed20 * 20;

        if (amount == 0) {
            banknote20 -= needed20;
            banknote50 -= needed50;
            banknote100 -= needed100;

            System.out.println("Выданно купюр:");
            if (needed20 > 0) System.out.println("Купюр 20руб: " + needed20);
            if (needed50 > 0) System.out.println("Купюр 50руб: " + needed50);
            if (needed100 > 0) System.out.println("Купюр 100руб: " + needed100);
            return true;
        } else {
            System.out.println("Невозможно выдать сумму " + needAmoutnt + " руб. Имеющихся купюр недостаточно или невозможно разбить сумму.");
            return false;
        }*/

    // перебор всех возможных комбинаций
    boolean deleteAmountATM(int amount) {
        int total = 0;
        for (int needed100 = Math.min(amount / 100, banknote100); needed100 >= 0; needed100--) {
            for (int needed50 = Math.min((amount - needed100 * 100) / 50, banknote50); needed50 >= 0; needed50--) {
                for (int needed20 = Math.min((amount - (needed100 * 100 + needed50 * 50)) / 20, banknote20); needed20 >= 0; needed20--) {
                     total = needed100 * 100 + needed50 * 50 + needed20 * 20;
                    if (total == amount) {
                        banknote20 -= needed20;
                        banknote50 -= needed50;
                        banknote100 -= needed100;

                        System.out.println("Выданно купюр:");
                        if (needed20 > 0) System.out.println("Купюр 20руб: " + needed20);
                        if (needed50 > 0) System.out.println("Купюр 50руб: " + needed50);
                        if (needed100 > 0) System.out.println("Купюр 100руб: " + needed100);
                        return true;
                    }
                }

            }
        }

        System.out.println("Невозможно выдать сумму " + total + " руб. Имеющихся купюр недостаточно или невозможно разбить сумму.");
        return false;
    }
}
