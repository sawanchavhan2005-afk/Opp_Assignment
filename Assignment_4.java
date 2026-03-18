// Q4. Define a class Resort with the following description:
// Members: RNo (Room Number), Name (Customer Name), Charges (per day), Days (stay days)
// Member Functions:
// Compute() → returns Days * Charges, if >11000 then 1.02 * Days * Charges
// Getinfo() → input values
// DispInfo() → display details with computed amount
class Resort {
    int RNo;
    String Name;
    float Charges;
    int Days;

    float Compute() {
        float amount = Days * Charges;
        if (amount > 11000) {
            amount = 1.02f * amount;
        }
        return amount;
    }

    void Getinfo(int r, String n, float c, int d) {
        RNo = r;
        Name = n;
        Charges = c;
        Days = d;
    }

    void DispInfo() {
        System.out.println(RNo + " " + Name + " " + Charges + " " + Days + " Amount: " + Compute());
    }
}