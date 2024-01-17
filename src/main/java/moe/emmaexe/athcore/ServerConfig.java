// Unused, skip for now.
/*
package moe.emmaexe.athcore;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber(modid = ATHCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ServerConfig {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.IntValue DROP_CHANCE = BUILDER
            .comment("This value represents the chance for any single item to drop onto the ground instead of being stored in the grave after death")
            .defineInRange("dropChance", 30, 0, 100);

    public static final ForgeConfigSpec SPEC = BUILDER.build();

    public static int dropChance;

    @SubscribeEvent
    public void onLoad(final ModConfigEvent event) {
        dropChance = DROP_CHANCE.get();
    }
}
*/
