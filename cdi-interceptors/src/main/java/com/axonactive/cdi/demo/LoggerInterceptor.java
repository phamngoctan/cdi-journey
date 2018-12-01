package com.axonactive.cdi.demo;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor @Loggable
public class LoggerInterceptor {
 
    @Inject
    private MyLogger logger; //The logger here again, outside the Checkout class :)
 
    @AroundInvoke
    public Object log(InvocationContext ic) throws Exception {
        Loggable annotation = ic.getMethod().getAnnotation(Loggable.class);
        String messageToBeLogged = annotation.message();
 
        logger.log(messageToBeLogged);
 
        Object result = ic.proceed();
 
        return result;
    }
 
}
