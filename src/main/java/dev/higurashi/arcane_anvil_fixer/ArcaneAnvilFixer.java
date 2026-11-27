package dev.higurashi.arcane_anvil_fixer;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(ArcaneAnvilFixer.MOD_ID)
public class ArcaneAnvilFixer {
    public static final String MOD_ID = "arcane_anvil_fixer";

    public ArcaneAnvilFixer(IEventBus eventBus, ModContainer container) {
    }

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
