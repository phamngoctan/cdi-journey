package com.axonactive.cdi.demo;

import javax.enterprise.inject.Alternative;

@Alternative
public class AnotherCoderImpl implements Coder {

    public String codeString() {
        return ("Another coder implementation");
    }
}
