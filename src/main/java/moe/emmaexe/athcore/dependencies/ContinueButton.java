package moe.emmaexe.athcore.dependencies;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;

public class ContinueButton extends Button {
    
    public ContinueButton(int x, int y, int width, int height) {
        super(x, y, width, height, Component.literal("Ignore and Continue"), null);
    }

    @Override
    public void onPress() {
        DependencyManager.ignoreCheck = true;
        Minecraft.getInstance().setScreen(new TitleScreen());
    }
}
