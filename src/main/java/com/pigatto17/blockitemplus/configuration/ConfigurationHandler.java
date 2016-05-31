package com.pigatto17.blockitemplus.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try
        {
            configuration.load();

            configValue = configuration.get("ForgeCraft", "configValue", true, "This is an example config").getBoolean(true);
        }
        catch (Exception e)
        {
            // Log The Exception
        }
        finally
        {
            configuration.save();
        }
    }
}
