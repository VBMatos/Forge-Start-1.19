package net.vbm.startmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vbm.startmod.StartMod;
import net.vbm.startmod.item.custom.DiceItem;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, StartMod.MOD_ID);

    public static final RegistryObject<Item> REFINED_EMERALD = ITEMS.register("refined_emerald", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REFINED_RUBY = ITEMS.register("refined_ruby", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REFINED_SAPPHIRE = ITEMS.register("refined_sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REFINED_CITRINE = ITEMS.register("refined_citrine", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DICE = ITEMS.register("dice", () -> new DiceItem(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
