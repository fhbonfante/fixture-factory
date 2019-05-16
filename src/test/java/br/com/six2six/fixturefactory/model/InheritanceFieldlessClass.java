package br.com.six2six.fixturefactory.model;

public class InheritanceFieldlessClass extends FieldlessClass {
    private static final String SUBCLASSATTRIBUTE = "subclassAttribute";

    public String getSubclassattribute() {
        return (String) this.attributes.get(SUBCLASSATTRIBUTE);
    }

    public void setSubclassattribute(String subclassattribute) {
        this.attributes.put(SUBCLASSATTRIBUTE, subclassattribute);
    }
}
