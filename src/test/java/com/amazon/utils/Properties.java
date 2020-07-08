package com.amazon.utils;

import java.net.URL;

public class Properties {

    public static final long SHORT_WAIT = 3;
    public static final long MID_WAIT = 15;
    public static final long LONG_WAIT = 30;


    public static final String URL = "https://www.amazon.com.mx";

    //never share passwords or users here.
    public static final String USERNAME = "";
    public static final String PASSWORD = "";

    /*
    public enum Wait {
        SHORT_WAIT (3),
        MID_WAIT (15),
        LONG_WAIT(30);

        private final int waitTime;

        private Wait(int waitTime) {
            this.waitTime = waitTime;
        }

        public int getWaitTime() {
            return waitTime;
        }
    }
    */
}
