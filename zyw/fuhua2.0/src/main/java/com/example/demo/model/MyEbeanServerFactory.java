package com.example.demo.model;/**
 * Created by hasee on 2019/11/11.
 */

import io.ebean.EbeanServer;
import io.ebean.EbeanServerFactory;
import io.ebean.config.ServerConfig;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * @Author zyw
 * @Description 自定义FactoryBean
 * @Date 11:54 2019/11/11
 * @Param: null
 * @Return
 */
@Component
public class MyEbeanServerFactory implements FactoryBean<EbeanServer> {


    @Nullable
    @Override
    public EbeanServer getObject() throws Exception {
        return createEbeanServer();
    }

    @Nullable
    @Override
    public Class<?> getObjectType() {
        return EbeanServer.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
    /**
     * Create a EbeanServer instance.
     */
    private EbeanServer createEbeanServer() {

        ServerConfig config = new ServerConfig();
        config.setName("db");

        // load configuration from ebean.properties
        config.loadFromProperties();
        config.setDefaultServer(true);
        // other programmatic configuration

        return EbeanServerFactory.create(config);
    }


}
