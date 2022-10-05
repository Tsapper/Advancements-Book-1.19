package net.tsapper.advancementsbook;

import net.fabricmc.api.ModInitializer;
import net.tsapper.advancementsbook.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdvancementsBook implements ModInitializer {
	public static final String MOD_ID = "advancementsbook";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItems.registerModItem();
	}
}
