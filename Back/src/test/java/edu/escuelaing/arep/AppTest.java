package edu.escuelaing.arep;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;

import java.util.ArrayList;

public class AppTest extends TestCase {

    private ArrayList<TestThread> threads;

    public AppTest( String testName ) {
        super( testName );
        threads = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            threads.add(new TestThread());
        }
    }

    public static Test suite(){
        return new TestSuite( AppTest.class );
    }

    public void testApp(){
        assertTrue( true );
    }

}
