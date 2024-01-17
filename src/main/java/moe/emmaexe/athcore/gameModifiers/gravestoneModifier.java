package moe.emmaexe.athcore.gameModifiers;

import moe.emmaexe.athcore.Config;
import moe.emmaexe.athcore.ServerConfig;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = moe.emmaexe.athcore.ATHCore.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class gravestoneModifier {
    public static boolean shouldDropItem(ItemStack item, RandomSource random) {
        return random.nextInt(100) + 1 <= Config.dropChance;
    }
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onPlayerDeath(LivingDropsEvent event) {
        if (event.getEntity() == null || !(event.getEntity() instanceof Player player)) {return;}
        Level world = player.getLevel();
        List<ItemEntity> drops = event.getDrops().stream().toList();
        List<ItemEntity> newDrops = new ArrayList<>();
        for (ItemEntity drop: drops) {
            if (shouldDropItem(drop.getItem(), world.getRandom())) {
                player.drop(drop.getItem(), true);
            } else {
                newDrops.add(drop);
            }
        }
        event.getDrops().clear();
        event.getDrops().addAll(newDrops);
    }
}
