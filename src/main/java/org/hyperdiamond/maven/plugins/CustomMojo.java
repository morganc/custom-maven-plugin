package org.hyperdiamond.maven.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * @goal custom
 * @requiresProject false
 */
public class CustomMojo extends AbstractMojo
{
    public void execute() throws MojoExecutionException, MojoFailureException
    {
        this.getLog().info("Executing Custom Mojo");
    }
}

