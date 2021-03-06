package net.glasslauncher.mods.api.gcapi.api;

import blue.endless.jankson.JsonElement;
import com.google.common.collect.ImmutableMap;
import net.glasslauncher.mods.api.gcapi.impl.config.ConfigEntry;
import uk.co.benjiweber.expressions.function.OctFunction;

import java.lang.reflect.*;
import java.util.function.*;

public interface ConfigFactoryProvider {

    /**
     * Return custom factories for certain config class types.
     * @param immutableBuilder Arguments for the OctFunction are: id, name, description, field, parentObject, value, multiplayerSynced, maxLength.
     *                         Should return a class returning a config entry for your custom config type.
     */
    void provideLoadFactories(ImmutableMap.Builder<Type, OctFunction<String, String, String, Field, Object, Boolean, Object, MaxLength, ConfigEntry<?>>> immutableBuilder);

    /**
     * Return custom factories for certain config class types.
     * @param immutableBuilder Arguments for the Function are: value.
     *                         Should return a JsonElement containing the serialized value for your custom config type.
     */
    void provideSaveFactories(ImmutableMap.Builder<Type, Function<Object, JsonElement>> immutableBuilder);
}
