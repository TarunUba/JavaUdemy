package com.tarunuba;

import static com.tarunuba.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
            System.out.println(ANSI_RED +"hello from My runnables implement");
        }
    }
