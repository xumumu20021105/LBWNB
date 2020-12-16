package com.example.data_12_15.factory2;

public class SunmPhoneFactory extends CreatePhoneFactory {
    @Override
    public Phone createPhone() {
        return new SunmPhone();
    }
}
