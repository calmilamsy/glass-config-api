package net.glasslauncher.mods.api.gcapi.api;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// TODO: Actually implement
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface LongDescription {

    /**
     * !!!Unimplemented!!!
     * To be used in the future for a scrollable full-screen explanation of your config entry or category.
     * @return TBD.
     */
    String value();
}
