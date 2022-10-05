package net.tsapper.advancementsbook.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.tsapper.advancementsbook.AdvancementsBook;
import net.tsapper.advancementsbook.item.custom.AdvancementsBookItem;

public class ModItems
{
    public static final Item ADVANCEMENTS_BOOK = registerItem("advancements_book", new AdvancementsBookItem(new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.RARE)));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(AdvancementsBook.MOD_ID, name), item);
    }

    public static void registerModItem()
    {
        AdvancementsBook.LOGGER.debug("Registering Mod Items For" + AdvancementsBook.MOD_ID);
    }
}
