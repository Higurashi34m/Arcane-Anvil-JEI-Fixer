package dev.higurashi.arcane_anvil_fixer;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ArcaneAnvilFixer.MOD_ID)
public class ArcaneAnvilFixer {
    public static final String MOD_ID = "arcane_anvil_fixer";

    public ArcaneAnvilFixer(FMLJavaModLoadingContext context) {
        IEventBus eventBus = context.getModEventBus();
    }

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
