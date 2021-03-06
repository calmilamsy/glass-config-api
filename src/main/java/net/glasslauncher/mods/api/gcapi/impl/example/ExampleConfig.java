package net.glasslauncher.mods.api.gcapi.impl.example;

import net.glasslauncher.mods.api.gcapi.api.GConfig;

/**
 * An example parent config class. You can put @GConfig configs inside classes with other non-config related functionality without issue.
 */
public class ExampleConfig {

    @GConfig(value = "config", visibleName = "Config stuff", primary = true)
    public static final ExampleConfigClass exampleConfigClass = new ExampleConfigClass();

    @GConfig(value = "second", visibleName = "Second Config")
    public static final SecondConfigClass secondConfigClass = new SecondConfigClass();

    @GConfig(value = "third", visibleName = "Third Config")
    public static final ThirdConfigClass thirdConfigClass = new ThirdConfigClass();
}
