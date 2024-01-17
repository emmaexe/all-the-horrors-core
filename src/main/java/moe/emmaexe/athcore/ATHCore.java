package moe.emmaexe.athcore;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;

@Mod(ATHCore.MODID)
public class ATHCore {
    public static final String MODID = "athcore";
    private static final Logger LOGGER = LogUtils.getLogger();

    /* 
        TODO: Turn off spawning of all horror mobs for the first X days
        Also add something like this to count down those days:
        https://modrinth.com/datapack/vanilla-refresh
        https://www.reddit.com/r/Minecraft/comments/188bpsg/does_anyone_know_what_mod_adds_this/
    */
   
    public ATHCore() {
        // Unused, skip for now.
        /*
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, ClientConfig.SPEC);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, ServerConfig.SPEC);
        */
    }
}
