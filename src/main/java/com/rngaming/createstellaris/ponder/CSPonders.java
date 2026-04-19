package com.rngaming.createstellaris.ponder;

import com.rngaming.createstellaris.CreateStellaris;
import com.simibubi.create.AllBlocks;
import com.tterrag.registrate.util.entry.ItemProviderEntry;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.createmod.ponder.api.registration.PonderPlugin;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.minecraft.resources.ResourceLocation;


public class CSPonders implements PonderPlugin {

    public static void register(PonderSceneRegistrationHelper<ResourceLocation> helper) {
        PonderSceneRegistrationHelper<ItemProviderEntry<?,?>> HELPER = helper.withKeyFunction(RegistryEntry::getId);
        HELPER.addStoryBoard(AllBlocks.BRASS_BLOCK, "stellaris_machine/coalgeneratorponder", CSScenes::CoalGenPonder);
    }
    @Override
    public String getModId() {
        return CreateStellaris.MODID;
    }
}
