
// Q18. Bank with final interest rate and calculateInterest()
class BankFinal {
    final double interestRate = 5.5;

    double calculateInterest(double amt) {
        return amt * interestRate / 100;
    }
}