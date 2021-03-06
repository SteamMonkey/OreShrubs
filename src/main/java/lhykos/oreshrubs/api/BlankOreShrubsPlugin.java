/**
 * This file is part of the OreShrubs mod for Minecraft.
 * The project is distributed under the OreShrubs-Licence
 * to be found at 'https://github.com/Lhykos/OreShrubs/'
 *
 * Get the available Source Code on GitHub: 'https://github.com/Lhykos/OreShrubs'
 *
 * File created by Lhykos on [09.06.2017 - 20:53]
 */
package lhykos.oreshrubs.api;

import lhykos.oreshrubs.api.oreshrub.OreShrubVariant;
import lhykos.oreshrubs.api.lootbag.LootBagVariant;

/**
 * A base implementation of the {@link IOreShrubsPlugin}.
 * Extend your plugin from this base to avoid implementing methods you don't need.
 * Your mod still mus have the {@link OreShrubsPlugin} annotation to ger recognised by OreShrubs.
 */
public abstract class BlankOreShrubsPlugin implements IOreShrubsPlugin
{
	@Override
	public void registerOreShrubs(IVariantRegistry<OreShrubVariant> oreShrubRegistry, IShrubHelper shrubHelper) {}

	@Override
	public void registerLootBags(IVariantRegistry<LootBagVariant> lootBagRegistry, ILootBagHelper lootBagHelper) {}
}
