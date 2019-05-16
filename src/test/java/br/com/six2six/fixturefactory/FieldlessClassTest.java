package br.com.six2six.fixturefactory;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import br.com.six2six.fixturefactory.model.FieldlessClass;
import br.com.six2six.fixturefactory.model.InheritanceFieldlessClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static br.com.six2six.template.FieldlessClassTemplate.*;

public class FieldlessClassTest {

    public static final int QUANTITY = 3;

    @BeforeClass
    public static void setup() {
        FixtureFactoryLoader.loadTemplates("br.com.six2six.template");
    }

    @Test
    public void shouldBePossibleToGenerateFixtureFromClassWithoutFieldsAndOnlyAccessors() {
        FieldlessClass fieldlessClass = Fixture.from(FieldlessClass.class).gimme("test");
        Assert.assertNotNull(fieldlessClass);
        Assert.assertEquals(FIELDLESSCLASS_CODE, fieldlessClass.getCode());
        Assert.assertEquals(FIELDLESSCLASS_NUMBER, fieldlessClass.getNumber().intValue());
    }

    @Test
    public void shouldBePossibleToCallGimmeWithQuantity() {
        List<FieldlessClass> fieldlessClasses = Fixture.from(FieldlessClass.class).gimme(QUANTITY,"test");
        Assert.assertNotNull(fieldlessClasses);
        Assert.assertEquals(QUANTITY, fieldlessClasses.size());
    }

    @Test
    public void shouldBePossibleToHaveNestedAttributeDeclarations() {
        FieldlessClass fieldlessClass = Fixture.from(FieldlessClass.class).gimme("testWithNestedAttr");
        Assert.assertNotNull(fieldlessClass);
        Assert.assertEquals(FIELDLESSCLASS_CODE, fieldlessClass.getCode());
        Assert.assertEquals(FIELDLESSCLASS_NUMBER, fieldlessClass.getNumber().intValue());
        Assert.assertEquals(FIELDLESSDEPENDENCYCLASS_CODE, fieldlessClass.getDependency().getCode());
    }

    @Test
    public void shouldBePossibleToMakeFixtureUsingInheritedAttributes() {
        InheritanceFieldlessClass fieldlessClass = Fixture.from(InheritanceFieldlessClass.class).gimme("testWithInheritedAttr");
        Assert.assertNotNull(fieldlessClass);
        Assert.assertEquals(FIELDLESSCLASS_CODE, fieldlessClass.getCode());
        Assert.assertEquals(FIELDLESSCLASS_NUMBER, fieldlessClass.getNumber().intValue());
        Assert.assertEquals(FIELDLESSDEPENDENCYCLASS_CODE, fieldlessClass.getDependency().getCode());
        Assert.assertEquals(SUBCLASS_ATTRIBUTE, fieldlessClass.getSubclassattribute());
    }
}

