package moe.emmaexe.athcore.dependencies;

import java.io.File;
// import org.slf4j.Logger;
// import com.mojang.logging.LogUtils;
import moe.emmaexe.athcore.Config;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = moe.emmaexe.athcore.ATHCore.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class DependencyManager {
    // private static final Logger LOGGER = LogUtils.getLogger();
    public static boolean ignoreCheck = Config.skipDependencyCheck;

    @SubscribeEvent
    public static void onInitScreenEventPost(ScreenEvent.Init.Post event) {
        if (ignoreCheck) {return;}
        if (event.getScreen() instanceof TitleScreen && checkDependencies()) {
            Minecraft.getInstance().setScreen(new DownloadScreen());
        }
    }

    private static boolean checkDependencies() {
        File resourcepackFolder = Minecraft.getInstance().getResourcePackDirectory();
        String resourcepackName = "CaveDweller_SoundOverhaul.zip";
        File resourcepackFile = new File(resourcepackFolder, resourcepackName);
        return !resourcepackFile.exists();
    }
}
