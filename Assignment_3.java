/*
3. Define a class CARRENTAL with the following details:
Class Members:
- CarId of int type
- CarType of string type
- Rent of float type

Methods:
- GetCar() method which accepts CarId and CarType.
- GetRent() method which returns rent of the car based on car type:
  Small Car = 1000
  Van = 800
  SUV = 2500
- ShowCar() method which displays car id, type and rent.
*/

import java.util.Scanner;

class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
    }

    float GetRent() {
        if (CarType.equalsIgnoreCase("Small Car"))
            Rent = 1000;
        else if (CarType.equalsIgnoreCase("Van"))
            Rent = 800;
        else if (CarType.equalsIgnoreCase("SUV"))
            Rent = 2500;
        else
            Rent = 0;

        return Rent;
    }

    void ShowCar() {
        System.out.println("Car ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CARRENTAL c = new CARRENTAL();

        System.out.print("Enter Car ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Car Type (Small Car / Van / SUV): ");
        String type = sc.nextLine();

        c.GetCar(id, type);
        c.GetRent();
        c.ShowCar();
    }
}