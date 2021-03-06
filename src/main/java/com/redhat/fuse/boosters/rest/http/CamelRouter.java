package com.redhat.fuse.boosters.rest.http;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

/**
 * A simple Camel REST DSL route that implements the greetings service.
 * 
 */
@Component
public class CamelRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        // @formatter:off
        restConfiguration()
                .apiContextPath("/api-doc")
                .apiProperty("api.title", "Greeting REST API")
                .apiProperty("api.version", "1.0")
                .apiProperty("cors", "true")
                .apiProperty("base.path", "camel/")
                .apiProperty("api.path", "/")
                .apiProperty("host", "")
                .apiContextRouteId("doc-api")
            .component("servlet")
            .bindingMode(RestBindingMode.json);
        
            rest("/email").description("Send Email")
            .post("/sendEmail").to("direct:sendEmailImpl")
            .type(Email.class)
                .outType(RetornoEnvio.class)
                .route().routeId("sendEmail-api")
                .to("direct:sendEmailImpl");

                from("direct:sendEmailImpl").description("Send Email REST service implementation route")
                .streamCaching()
                .to("bean:sendEmailService?method=postSendEmail");  
        // @formatter:on
    }

}