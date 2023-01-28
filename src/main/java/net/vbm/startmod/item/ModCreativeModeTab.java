package net.vbm.startmod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.vbm.startmod.StartMod;

@Mod.EventBusSubscriber(modid = StartMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {
    public static CreativeModeTab START_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        START_TAB = event.registerCreativeModeTab(new ResourceLocation(StartMod.MOD_ID, "start_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.RUBY.get())).title(Component.literal("Start Tab")).build());
    }
}
