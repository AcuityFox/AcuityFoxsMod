package io.github.AcuityFox.acuityfoxmod.items;

import io.github.AcuityFox.acuityfoxmod.afm;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, afm.MODID);

    public static final RegistryObject<Item> DEVITEM = ITEMS.register("devitem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPERPLATE = ITEMS.register("copper_plate",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
