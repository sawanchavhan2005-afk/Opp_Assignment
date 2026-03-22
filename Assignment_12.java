// Q12. Create abstract class Payment with method pay()
// Subclasses: CreditCardPayment, UPIPayment, NetBankingPayment
abstract class Payment {
    abstract void pay(double amount);
}