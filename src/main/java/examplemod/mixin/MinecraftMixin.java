package examplemod.mixin;

import net.minecraft.src.GuiMainMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiMainMenu.class)
public class MinecraftMixin {

    @Shadow private String splashText;

    @Inject(method="<init>", at = @At("TAIL"))
    public void splashTextHijack(CallbackInfo ci) {
        splashText = "Lmao";
    }
}
