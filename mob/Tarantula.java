package me.spaceramen.aegis.mob;

import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;

public class Tarantula extends AegisMob
{
    public Tarantula()
    {
        super(ChatColor.RED + "Tarantula", EntityType.SPIDER, 2000.0, 500);
    }
}