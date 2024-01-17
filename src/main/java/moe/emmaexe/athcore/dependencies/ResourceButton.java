package moe.emmaexe.athcore.dependencies;

import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;

public class ResourceButton extends Button {
    private String resourceUrl;

    public ResourceButton(final int x, final int y, final int width, final int height, final String name, final String url) {
        super(x, y, width, height, Component.literal(name), null);
        resourceUrl = url;
    }

    @Override
    public void onPress() {
        DownloadScreen.openWebPage(resourceUrl);
        DownloadScreen.openResourcePackFolder();
    }
}
