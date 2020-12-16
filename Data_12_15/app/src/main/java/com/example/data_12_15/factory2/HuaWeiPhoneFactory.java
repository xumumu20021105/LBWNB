package com.example.data_12_15.factory2;

public class HuaWeiPhoneFactory extends CreatePhoneFactory {
    @Override
    public Phone createPhone() {
        return new HuaWeiPhone();
    }
}
