package org.example.e87;

// Declare the Car class
public class CarTest {
    public static void main(String[] args) {
        E87Car m1=new E87Car ();
        m1.carColor="Black";
        m1.carYear=2019;
        m1.carMake="BMW";
        System.out.println("Car color is "+ m1.carColor +  " and car year is " + m1.carYear + " and car model is " + m1.carMake);

E87Car m2= new E87Car();
m2.carColor="White";
m2.carYear=2018;
m2.carMake="Toyota";
        System.out.println("Car color is "+ m2.carColor +  " and car year is " + m2.carYear + " and car model is " + m2.carMake);

    }
    // Declare a String variable named 'carColor'
    // Declare an integer variable named 'carYear'
    // Declare a String variable named 'carMake'



}
