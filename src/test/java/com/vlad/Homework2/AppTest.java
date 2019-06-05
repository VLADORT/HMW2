package com.vlad.Homework2;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import junit.framework.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;


public class AppTest {


    @Rule
    public TestWatcher watcher = new TestWatcher() {

        @Override
        protected void starting(Description description) {
            System.out.println("starting");
        }



        @Override
        protected void finished(Description description) {
            System.out.println("finished");
        }
    };

    @Test
    public void shouldReturnHelloFromApp() {
        Assert.assertEquals("Hello from App", App.sayHello());
        System.out.println("test1 succesful");
    }

    @Test
    public void shouldReturnOneWhenMethodIsInvoked(){
        assertThat(App.returnOne(),is(1));
        System.out.println("test2 succesful");
    }

    @Test
    public void shouldReturnClassNameWhenIsInvoked() {
        assertThat(App.getClassName(),is("App"));
        System.out.println("Test3 success");
    }

}
