package me.spaceramen.aegis.item;

import me.spaceramen.aegis.gui.TrashCanGUI;
import org.bukkit.Material;

public class TrashCan extends AegisItem
{
    public TrashCan()
    {
        super("Trash Can", Material.CAULDRON, Rarity.COMMON);
        super.setGUI(new TrashCanGUI());
        super.glow();
        super.applyMetaToStack();
    }
}