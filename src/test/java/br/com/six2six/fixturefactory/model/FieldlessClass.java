package br.com.six2six.fixturefactory.model;

public class FieldlessClass extends AbstractFieldlessClass {

    private static final String CODE = "code";
    private static final String NUMBER = "number";
    private static final String DEPENDENCY = "dependency";

    public String getCode() {
        return (String) this.attributes.get(CODE);
    }

    public Integer getNumber() {
        return (Integer) this.attributes.get(NUMBER);
    }

    public void setCode(String code) {
        this.attributes.put(CODE,code);
    }

    public void setNumber(Integer number) {
        this.attributes.put(NUMBER,number);
    }

    public FieldlessDependencyClass getDependency() {
        return (FieldlessDependencyClass) this.attributes.get(DEPENDENCY);
    }

    public void setDependency(FieldlessDependencyClass dependency) {
        this.attributes.put(DEPENDENCY,dependency);
    }
}

