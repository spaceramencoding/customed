package me.spaceramen.aegis.config;

import me.spaceramen.aegis.Aegis;
import me.spaceramen.aegis.util.AUtil;
import org.bukkit.plugin.PluginDescriptionFile;

public enum AegisVariable
{
    PLUGIN_NAME("plugin.name"),
    PLUGIN_FULLNAME("plugin.fullName"),
    PLUGIN_DESCRIPTION("plugin.description"),
    PLUGIN_VERSION("plugin.version"),
    PLUGIN_AUTHORS("plugin.authors"),
    DATE("system.date"),
    TIME("system.time");

    private String name;

    AegisVariable(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return "%" + name + "%";
    }

    public Object getContent()
    {
        PluginDescriptionFile info = Aegis.getInfo();
        switch (this)
        {
            case PLUGIN_NAME: return info.getName();
            case PLUGIN_FULLNAME: return info.getFullName();
            case PLUGIN_DESCRIPTION: return info.getDescription();
            case PLUGIN_VERSION: return info.getVersion();
            case PLUGIN_AUTHORS: return info.getAuthors();
            case DATE: return AUtil.getCurrentDate();
            case TIME: return AUtil.getCurrentTime();
        }
        return null;
    }
}