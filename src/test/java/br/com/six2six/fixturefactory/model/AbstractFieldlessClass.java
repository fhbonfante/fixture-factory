package br.com.six2six.fixturefactory.model;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractFieldlessClass {
    protected Map<String,Object> attributes;

    public AbstractFieldlessClass() {
        attributes = new HashMap<>();
    }
}
