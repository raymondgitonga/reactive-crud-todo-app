package com.quicktutorialz.nio;

import com.mawashi.nio.jetty.ReactiveJ;
import com.quicktutorialz.nio.endpoints.v1.TodoEndpoints;

public class MainApplication {

    public static void main(String[] args) throws Exception {
        new ReactiveJ().port(9111)
                .endpoints(new TodoEndpoints())
                .start();
    }
}
