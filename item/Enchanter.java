package me.spaceramen.aegis.item;

import me.spaceramen.aegis.gui.EnchanterGUI;
import org.bukkit.Material;

public class Enchanter extends AegisItem
{
    public Enchanter()
    {
        super("Enchanter", Material.ANVIL, Rarity.UNCOMMON);
        super.setGUI(new EnchanterGUI());
        Recipe recipe = new Recipe("BBB", " I ", "III");
        recipe.setIngredient('B', Material.IRON_BLOCK);
        recipe.setIngredient('I', Material.IRON_INGOT);
        super.setRecipe(recipe);
        super.glow();
        super.applyMetaToStack();
    }
}
