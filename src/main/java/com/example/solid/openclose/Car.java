package com.example.solid.openclose;

public class Car extends OpenClose{


    String number = "LB-740";
    public void getCarNumber(){
        String num = this.vehicleNumber(number);
        System.out.println("Car: "+num);
    }

}
