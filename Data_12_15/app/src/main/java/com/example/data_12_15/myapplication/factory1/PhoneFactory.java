package com.example.data_12_15.myapplication.factory1;

public class PhoneFactory {
    public static Phone getInstance(String qwe){
        if(qwe.equals("MPhone")){
            return new Miphone();
        }else if(qwe.equals("IPhone")){
            return new IPhone();
        }
        return null;
    }
}
