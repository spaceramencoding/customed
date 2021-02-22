package me.spaceramen.aegis.item;

import me.spaceramen.aegis.gui.CrusherGUI;
import org.bukkit.Material;

public class Crusher extends AegisItem
{
    public Crusher()
    {
        super("Crusher", Material.FURNACE, Rarity.COMMON);
        super.setGUI(new CrusherGUI());
        Recipe recipe = new Recipe("CCC", "CAC", "CCC");
        recipe.setIngredient('C', Material.COBBLESTONE);
        recipe.setIngredient('A', Material.ANVIL);
        super.setRecipe(recipe);
        super.glow();
        super.applyMetaToStack();
    }
}
