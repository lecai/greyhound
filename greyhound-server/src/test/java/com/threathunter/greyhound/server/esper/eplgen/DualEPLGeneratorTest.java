package com.threathunter.greyhound.server.esper.eplgen;

import com.threathunter.greyhound.server.VariableMetaWrapper;
import com.threathunter.variable.meta.DualVariableMeta;
import org.junit.Test;

/**
 * 
 */
public class DualEPLGeneratorTest {
    @Test
    public void testDual() {
        System.out.println(new DualEPLGenerator().generateEPL(new VariableMetaWrapper<>((DualVariableMeta) VariableMetaTestHelper.getMetaByName("ip_get_ratio"), null)));
    }
}
