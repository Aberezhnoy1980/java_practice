package ru.aberezhnoy.isp1.pay.impl;

import ru.aberezhnoy.isp1.pay.Payable;
import ru.aberezhnoy.isp1.pay.PhonePayable;

public class TerminalPaymentService implements Payable, PhonePayable {

    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Terminal pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Terminal pay by credit card %d\n", amount);
    }

    @Override
    public void payPhoneNumber(int amount) {
        throw new RuntimeException();
    }
}