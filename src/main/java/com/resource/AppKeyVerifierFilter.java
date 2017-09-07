package com.resource;

import com.model.AppError;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
@AppKeyVerifier
public class AppKeyVerifierFilter implements ContainerRequestFilter {

    private final static Logger LOGGER = LoggerFactory.getLogger(AppKeyVerifierFilter.class);

    private final static String APP_KEY = "994f4fe4-APP-KEY-f3d5af27e1ee";

    @Context
    private HttpServletRequest httpServletRequest;

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {

        String appKeyValueFromHeader = requestContext.getHeaderString("APP-KEY");
        LOGGER.info("APP Key:{}", appKeyValueFromHeader);
        if (!StringUtils.equals(APP_KEY, appKeyValueFromHeader) ) {
            requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED)
                                             .entity(new AppError("APP-KEY is not available or wrong"))
                                             .build());

        }
    }
}
