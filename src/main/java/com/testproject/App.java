package com.testproject;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.Router;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Vertx vertx = Vertx.vertx();
        HttpServer httpServer = vertx.createHttpServer();

//        httpServer.listen(8080);
        Router router = Router.router(vertx);
        router.route().handler(routingContext -> routingContext.response().putHeader("content-type","text/plain").end("hello nitish"));
        httpServer.requestHandler(router::accept).listen(8091);
    }
}
