package com.company;

public class Mobile implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public Mobile(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn =true;
        System.out.println("Mobile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println(phoneNumber);
        }
        else{
            System.out.println("switched off");
        }
    }

    @Override
    public void answer() {
        if(isRinging){System.out.println("Answering");isRinging=false;};
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber && isOn){
            isRinging = true;
            System.out.println("Melody Ring");
        }
        else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
