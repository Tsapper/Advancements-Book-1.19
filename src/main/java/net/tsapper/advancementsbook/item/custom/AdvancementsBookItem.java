package net.tsapper.advancementsbook.item.custom;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class AdvancementsBookItem extends Item
{
    public AdvancementsBookItem(Settings settings)
    {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand)
    {
        if (!world.isClient())
        {
            openAdvancements();
        }
        return super.use(world, user, hand);
    }

    private static void openAdvancements()
    {
        KeyBinding.onKeyPressed(InputUtil.fromTranslationKey(MinecraftClient.getInstance().options.advancementsKey.getBoundKeyTranslationKey()));
    }
}
