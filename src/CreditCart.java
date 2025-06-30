class CreditCart {
    String accountNum;
    double accountSum;

    CreditCart(String accountNum, double accountSum) {
        this.accountSum = accountSum;
        this.accountNum = accountNum;
    }

    public void addAmount(double amount) {
        if (amount > 0) {
            accountSum += amount;
            System.out.println("На счет " + accountNum + " зачисленно: " + amount);
        } else {
            System.out.println("Сумма должна быть положительной");
        }
    }

    public void deliteAmount(double amount) {
        if (amount > 0) {
            if (amount <= accountSum) {
                accountSum -= amount;
                System.out.println("Со счета " + accountNum + " списанно: " + amount);
            } else {
                System.out.println("Для списание не достаточно средств на счету.");
            }
        } else {
            System.out.println("Сумма должна быть положительной");
        }
    }

    String AllInformationAboutCart() {
        System.out.println("Номер счета: " + accountNum + "\nСумма на счету: " + accountSum + "\n");
        return "";
    }
}