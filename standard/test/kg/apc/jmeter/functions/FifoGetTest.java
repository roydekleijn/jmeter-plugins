package kg.apc.jmeter.functions;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.apache.jmeter.engine.util.CompoundVariable;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.samplers.Sampler;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class FifoGetTest {

    public FifoGetTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of execute method, of class FifoGet.
     */
    @Test
    public void testExecute() throws Exception {
        System.out.println("execute");
        SampleResult previousResult = null;
        Sampler currentSampler = null;
        FifoGet instance = new FifoGet();
        LinkedList<CompoundVariable> list = new LinkedList<CompoundVariable>();
        list.add(new CompoundVariable("FifoGettest"));
        list.add(new CompoundVariable("FifoGettest"));
        instance.setParameters(list);
        String expResult = "";
        String result = instance.execute(previousResult, currentSampler);
        assertEquals(expResult, result);
    }

    /**
     * Test of setParameters method, of class FifoGet.
     */
    @Test
    public void testSetParameters() throws Exception {
        System.out.println("setParameters");
        LinkedList<CompoundVariable> list = new LinkedList<CompoundVariable>();
        list.add(new CompoundVariable("FifoGettest"));
        list.add(new CompoundVariable("FifoGettest"));
        FifoGet instance = new FifoGet();
        instance.setParameters(list);
    }

    /**
     * Test of getReferenceKey method, of class FifoGet.
     */
    @Test
    public void testGetReferenceKey() {
        System.out.println("getReferenceKey");
        FifoGet instance = new FifoGet();
        String expResult = "__fifoGet";
        String result = instance.getReferenceKey();
        assertEquals(expResult, result);
    }

    /**
     * Test of getArgumentDesc method, of class FifoGet.
     */
    @Test
    public void testGetArgumentDesc() {
        System.out.println("getArgumentDesc");
        FifoGet instance = new FifoGet();
        List result = instance.getArgumentDesc();
        assertNotNull(result);
    }
}
