package com.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.container.DynamicFeature;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.FeatureContext;
import java.util.Arrays;
import java.util.List;

//@Provider
public class AppKeyFeature implements DynamicFeature {

    private final static Logger LOGGER = LoggerFactory.getLogger(AppKeyFeature.class);

    private static final List<Class<?>> API_CLASS_LIST = Arrays.asList(UserResource.class);

    @Override
    public void configure(ResourceInfo resourceInfo, FeatureContext context) {
        LOGGER.info("resourceInfo.getResourceClass():{}", resourceInfo.getResourceClass());
        if (API_CLASS_LIST.contains(resourceInfo.getResourceClass())) {
            context.register(AppRequestFilter.class);
        }
    }
}
