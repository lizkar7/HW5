/*
Создать класс CreditCard c полями номер счета, текущая сумма на счету.
1.Добавьте метод, который позволяет начислять сумму на кредитную карточку.
2.Добавьте метод, который позволяет снимать с карточки некоторую сумму.
3.Добавьте метод, который выводит текущую информацию о карточке.
Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
третьей. Выведите на экран текущее состояние всех трех карточек
*/


public class Main {
    public static void main(String[] args) {
        CreditCart cart1 = new CreditCart("000_111_333", 100.00);
        CreditCart cart2 = new CreditCart("444_555_666", 200.00);
        CreditCart cart3 = new CreditCart("777_888_999", 300.00);

        System.out.println("Состояние карт до изменения:");
        cart1.AllInformationAboutCart();
        cart2.AllInformationAboutCart();
        cart3.AllInformationAboutCart();

        cart1.addAmount(100.00);
        cart2.addAmount(100.00);
        cart3.deliteAmount(150.00);

        System.out.println("\nСостояние карт после изменения: ");
        cart1.AllInformationAboutCart();
        cart2.AllInformationAboutCart();
        cart3.AllInformationAboutCart();

    }


}