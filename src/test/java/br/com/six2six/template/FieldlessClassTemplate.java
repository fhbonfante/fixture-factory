package br.com.six2six.template;

import br.com.six2six.fixturefactory.model.FieldlessClass;
import br.com.six2six.fixturefactory.model.InheritanceFieldlessClass;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class FieldlessClassTemplate implements TemplateLoader {

    public static final String FIELDLESSCLASS_CODE = "123";
    public static final int FIELDLESSCLASS_NUMBER = 1;
    public static final String FIELDLESSDEPENDENCYCLASS_CODE = "321";
    public static final String SUBCLASS_ATTRIBUTE = "subclassAttribute";

    @Override
    public void load() {
        Fixture.of(FieldlessClass.class).addTemplate("test", new Rule() {{
            add("code", FIELDLESSCLASS_CODE);
            add("number", FIELDLESSCLASS_NUMBER);
        }});

        Fixture.of(FieldlessClass.class).addTemplate("testWithNestedAttr", new Rule() {{
            add("code",FIELDLESSCLASS_CODE);
            add("number",FIELDLESSCLASS_NUMBER);
            add("dependency.code", FIELDLESSDEPENDENCYCLASS_CODE);
        }});

        Fixture.of(InheritanceFieldlessClass.class).addTemplate("testWithInheritedAttr", new Rule() {{
            add("code",FIELDLESSCLASS_CODE);
            add("number",FIELDLESSCLASS_NUMBER);
            add("dependency.code", FIELDLESSDEPENDENCYCLASS_CODE);
            add("subclassAttribute", SUBCLASS_ATTRIBUTE);
        }});
    }
}
