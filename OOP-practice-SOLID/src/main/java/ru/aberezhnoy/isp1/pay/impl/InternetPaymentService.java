package ru.aberezhnoy.isp1.pay.impl;

import ru.aberezhnoy.isp1.pay.Payable;
import ru.aberezhnoy.isp1.pay.PhonePayable;

public class InternetPaymentService implements Payable, PhonePayable {
    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Internet pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Internet pay by credit card %d\n", amount);
    }

    @Override
    public void payPhoneNumber(int amount) {
        System.out.printf("Internet pay by phone number %d\n", amount);
    }
}
