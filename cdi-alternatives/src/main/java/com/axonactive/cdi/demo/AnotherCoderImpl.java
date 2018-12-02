package com.axonactive.cdi.demo;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Specializes;

//@Alternative
@Specializes
public class AnotherCoderImpl extends CoderImpl {

    public String codeString() {
        return ("Another coder implementation");
    }
}
