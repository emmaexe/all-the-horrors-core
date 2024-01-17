package moe.emmaexe.athcore.dependencies;

import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import org.jetbrains.annotations.NotNull;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.awt.Desktop;
import java.io.IOException;

public class DownloadScreen extends Screen {
    private final Component titleText = Component.literal("You are missing the following resources:");
    private final Component subtitleText = Component.literal("Click to download");
    private static int buttonX, topTextY, buttonWidth, buttonHeight, buttonY, buttonSpacing;
    private static int buttonCount = 0;
    private static ArrayList<String> urlList = new ArrayList<String>();

    public DownloadScreen() {
        super(Component.literal("Missing Resources"));
    }

    @Override
    protected void init() {
        topTextY = 10;
        buttonHeight = 20;
        buttonWidth = 200;
        buttonX = this.width / 2;
        buttonY = topTextY + 45;
        buttonSpacing = 25;

        addButton("Cave Dweller Sound Overhaul",
                "https://legacy.curseforge.com/minecraft/texture-packs/cave-dweller-sound-overhaul/files/4885855");

        int bottomButtons = buttonY + buttonSpacing * 5 + 10;
        this.addRenderableWidget(new Button(buttonX - buttonWidth / 2 - 50 - 5, bottomButtons, buttonWidth / 2 + 50,
                buttonHeight, Component.literal("Download All"), button -> downloadAll()));
        this.addRenderableWidget(new ContinueButton(buttonX + 5, bottomButtons, buttonWidth / 2 + 50, buttonHeight));
    }

    @Override
    public void render(@NotNull PoseStack matrices, int mouseX, int mouseY, float delta) {
        buttonCount = 0;
        // TODO: Check for bug if same thing happens to urlList that happened to buttonCount
        this.renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        drawCenteredString(matrices, this.font, titleText, buttonX, topTextY, 16777215);
        drawCenteredString(matrices, this.font, subtitleText, buttonX, topTextY + 15, 16777215);
    }

    protected void addButton(String resourceName, String downloadLink) {
        this.addRenderableWidget(
                new ResourceButton(buttonX - buttonWidth / 2, buttonY + buttonCount * buttonSpacing,
                        buttonWidth, buttonHeight, resourceName, downloadLink));
        urlList.add(downloadLink);
        buttonCount++;
    }

    protected static void openWebPage(String url) {
        try {
            net.minecraft.Util.getPlatform().openUri(new URI(url));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    protected static void openResourcePackFolder() {
        try {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.OPEN)) {
                Desktop.getDesktop().open(Minecraft.getInstance().getResourcePackDirectory());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected static void downloadAll() {
        for (String url: urlList) {
            openWebPage(url);
        }
        openResourcePackFolder();
    }
}