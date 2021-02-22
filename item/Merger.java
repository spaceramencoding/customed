package me.spaceramen.aegis.item;

import me.spaceramen.aegis.gui.MergerGUI;
import org.bukkit.Material;

public class Merger extends AegisItem
{
    public Merger()
    {
        super("Merger", Material.CRAFTING_TABLE, Rarity.COMMON);
        super.setGUI(new MergerGUI());
        super.glow();
        super.applyMetaToStack();
    }
}