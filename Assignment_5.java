// Q5. Define a class Employee with members empno, ename, basic, hra, da, netpay
// Functions:
// Calculate() → returns basic + hra + da
// havedata() → accepts values and calculates netpay
// dispdata() → displays all data
class Employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    float Calculate() {
        return basic + hra + da;
    }

    void havedata(int no, String name, float b, float h, float d) {
        empno = no;
        ename = name;
        basic = b;
        hra = h;
        da = d;
        netpay = Calculate();
    }

    void dispdata() {
        System.out.println(empno + " " + ename + " NetPay: " + netpay);
    }
}