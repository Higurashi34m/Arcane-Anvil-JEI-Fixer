package dev.higurashi.arcane_anvil_fixer.mixin;

import io.redspace.ironsspellbooks.jei.ArcaneAnvilJeiRecipe;
import io.redspace.ironsspellbooks.jei.ArcaneAnvilRecipeMaker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(value = ArcaneAnvilRecipeMaker.class, remap = false)
public class ArcaneAnvilRecipeMakerMixin {
    @Inject(method = "getRecipes", at = @At("HEAD"), cancellable = true)
    private static void arcane_anvil_fixer$onGetRecipe(CallbackInfoReturnable<List<ArcaneAnvilJeiRecipe>> cir) {
        cir.setReturnValue(List.of());
    }
}
