// Q13. Abstract class Employee with calculateBonus()
// Manager: 20% bonus
// Developer: 10% + incentive
abstract class Emp {
    String name;
    int id;

    abstract double calculateBonus();
}