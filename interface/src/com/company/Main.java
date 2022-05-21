package com.company;

public class Main {

    public static void main(String[] args) {
	ITelephone timsPhone;
    timsPhone = new Desktop(123125345);
    timsPhone.powerOn();
    timsPhone.callPhone(123125345);
    timsPhone.answer();
    ITelephone timsMobile;
    timsMobile = new Mobile(12345);
    timsMobile.powerOn();
    timsMobile.callPhone(12345);
    timsMobile.answer();

    }
}
