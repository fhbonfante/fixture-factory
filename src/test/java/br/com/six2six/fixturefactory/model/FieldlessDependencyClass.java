package br.com.six2six.fixturefactory.model;

public class FieldlessDependencyClass extends AbstractFieldlessClass {

    private static final String CODE = "code";

    public String getCode() {
        return (String) this.attributes.get(CODE);
    }

    public void setCode(String code) {
        this.attributes.put(CODE,code);
    }
}
