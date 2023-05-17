package com.homeofthewizard;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;
import org.codehaus.plexus.logging.Logger;

import javax.inject.Inject;

@Mojo( name = "sayhi")
public class MyMojo extends AbstractMojo
{
    @Inject
    private Logger logger;
    @Inject
    private MyComponent component;
    @Inject
    private MySpringBean mySpringBean;

    public void execute()
    {
        logger.info("executing mojo");
        try {
            component.hello();
            mySpringBean.hello();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}