
// Q15. Ride booking system using runtime polymorphism
// BikeRide: ₹5/km, AutoRide: ₹8/km, CarRide: ₹12/km
abstract class Ride {
    double distance;
    Ride(double d) { distance = d; }
    abstract double calculateFare();
}