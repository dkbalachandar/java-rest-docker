package com;

import com.service.UserDao;
import com.service.UserService;
import com.service.impl.MemoryDaoImpl;
import com.service.impl.UserServiceImpl;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import javax.inject.Singleton;

public class DependencyBinder extends ResourceConfig {

    public DependencyBinder() {
        register(JacksonFeature.class);
        register(new AbstractBinder() {
            @Override
            protected void configure() {
                bind(UserServiceImpl.class).to(UserService.class).in(Singleton.class);
                bind(MemoryDaoImpl.class).to(UserDao.class).in(Singleton.class);
            }
        });
    }
}