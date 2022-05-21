package com.tarunuba;

import static com.tarunuba.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"Hello from the main thread.");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN+"Hello from the anonymous class");
            }
        }.start();
        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();
        Thread miRunnableTHread = new Thread(new MyRunnable(){
            @Override
            public void run() {
//                super.run();
                System.out.println(ANSI_CYAN+"Hello form anonymous class");
                try{
                    anotherThread.join(2000);
                    System.out.println(ANSI_RED+"AnotherThread terminated or timed out");
                }
                catch(InterruptedException e){
                    System.out.println(ANSI_RED + "I couldnt wait after all. I was interruptd");
                }
            }
        });
        miRunnableTHread.start();
        //anotherThread.interrupt();
        System.out.println(ANSI_PURPLE+"Hello again from the main thread");


    }
}
