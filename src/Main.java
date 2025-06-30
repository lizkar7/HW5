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

        // TASK*
        /*ATM atm1=new ATM(10,12,5);
        ATM atm2=new ATM(10,2,0);

        atm1.addmAmountATM(1,1,0);
        atm1.addmAmountATM(-1,1,0);
        atm2.deleteAmountATM(250);*/
    }
}