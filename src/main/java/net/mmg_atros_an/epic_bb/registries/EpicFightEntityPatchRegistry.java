package net.mmg_atros_an.epic_bb.registries;

import com.github.tartaricacid.touhoulittlemaid.init.InitEntities;
import net.mmg_atros_an.epic_bb.EpicBB;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.mmg_atros_an.epic_bb.entitypatch.MaidPatch;
import yesman.epicfight.api.forgeevent.EntityPatchRegistryEvent;
import yesman.epicfight.gameasset.Armatures;

@Mod.EventBusSubscriber(modid = EpicBB.MODID , bus = Mod.EventBusSubscriber.Bus.MOD)
public class EpicFightEntityPatchRegistry {
    @SubscribeEvent
    public static void registerPatchedEntities(EntityPatchRegistryEvent event) {
        event.getTypeEntry().put(InitEntities.MAID.get(),entity -> MaidPatch::new);
    }

    @SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(EpicFightEntityPatchRegistry::registerEntityTypeArmatures);
    }

    private static void registerEntityTypeArmatures() {
        Armatures.registerEntityTypeArmature(InitEntities.MAID.get(), Armatures.BIPED);
    }
}
