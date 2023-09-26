package io.github.AcuityFox.acuityfoxmod.items;

import io.github.AcuityFox.acuityfoxmod.afm;
import io.github.AcuityFox.acuityfoxmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, afm.MODID);

    public static final RegistryObject<CreativeModeTab> AFM_TAB = CREATIVE_MODE_TABS.register("afm_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COPPERPLATE.get()))
                    .title(Component.translatable("creativetab.afm_tab"))
                    .displayItems(((pParameters, pOutput) -> {
                        //Blocks
                        //Items
                        pOutput.accept(ModItems.COPPERPLATE.get());
                        //DevItems
                        pOutput.accept(ModBlocks.DEVBLOCK.get());
                        pOutput.accept(ModItems.DEVITEM.get());
                        pOutput.accept(ModBlocks.DEVORE.get());
                    }))
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
