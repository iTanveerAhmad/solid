package com.example.solid.openclose;

public class Truck extends OpenClose{


    String number = "GLTB-5581";
    public void getTruckNumber(){
        System.out.println("Truck: "+this.vehicleNumber(number));
    }

}
