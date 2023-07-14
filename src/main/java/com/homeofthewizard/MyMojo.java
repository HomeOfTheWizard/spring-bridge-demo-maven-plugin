package com.homeofthewizard;

import com.homeofthewizard.hellolib.MyHelloer;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;
import org.codehaus.plexus.logging.Logger;
import org.springframework.vault.core.VaultTemplate;

import javax.inject.Inject;

@Mojo( name = "sayhi")
public class MyMojo extends AbstractMojo
{
    private final Logger logger;
    private final MySir component;
    private final MyHelloer helloer;
    private final VaultTemplate vaultTemplate;

    @Inject
    public MyMojo(Logger logger, MySir component, MyHelloer helloer, VaultTemplate vaultTemplate) {
        this.logger = logger;
        this.component = component;
        this.helloer = helloer;
        this.vaultTemplate = vaultTemplate;
    }

    public void execute()
    {
        logger.info("executing mojo");
        helloer.hello();
        component.hello();
    }
}