package com.example;

import ratpack.server.RatpackServer;
import ratpack.stream.Streams;

public class RatpackApp {

    public static void main(String[] args) throws Exception {
        RatpackServer.start(server -> server.handlers(c ->
                c
                        .all(ctx -> ctx.render(Streams.constant("Hello World").take(1)))
        ));
    }
}
