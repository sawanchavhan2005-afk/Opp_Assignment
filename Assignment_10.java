// Q10. Create interface Bank with getInterestRate()
// Implement in SBI, HDFC, ICICI and display rates
interface Bank {
    double getInterestRate();
}

class SBI implements Bank {
    public double getInterestRate() {
        return 6.5;
    }
}s