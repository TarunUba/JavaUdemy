package com.company;

public class Desktop implements ITelephone{
    private int myNumber;
    private boolean isRinging;

    public Desktop(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("IDC");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println(phoneNumber);
    }

    @Override
    public void answer() {
        if(isRinging){System.out.println("Answering");isRinging=false;};
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber){
            isRinging = true;
            System.out.println("Ring Ring");
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
