// Unused, skip for now.
/*
package moe.emmaexe.athcore;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber(modid = ATHCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientConfig {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.BooleanValue SKIP_DEPENDENCY_CHECK = BUILDER
            .comment("Whether to skip the modpack's dependency check step on startup")
            .define("skipDependencyCheck", false);
    public static final ForgeConfigSpec SPEC = BUILDER.build();

    public static boolean skipDependencyCheck;

    @SubscribeEvent
    public static void onLoad(final ModConfigEvent event) {
        skipDependencyCheck = SKIP_DEPENDENCY_CHECK.get();
    }
}
*/
