package com.axonactive.cdi.demo;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Auditable
public class AuditorInterceptor {
 
    @Inject //An Injection can be used here, inside the CDI Interceptor :)
    private Auditor auditor;
 
    @AroundInvoke
    public Object audit(InvocationContext ic) throws Exception {
        auditor.audit();
 
        Object result = ic.proceed();
 
        return result;
    }
 
}
