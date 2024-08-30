open module platform.manager {
    requires flow.server;
    requires hilla.endpoint;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.core;
    requires spring.web;
    requires platform.api;
    requires java.sql;

    uses org.ushodaya.dataplatform.component.Processor;

    exports org.ushodaya.dataplatform.manager;
}