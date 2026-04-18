package com.rngaming.createstellaris.ponder;

import com.simibubi.create.infrastructure.ponder.AllCreatePonderTags;
import com.st0x0ef.stellaris.common.blocks.machines.CoalGeneratorBlock;
import com.st0x0ef.stellaris.common.registry.BlockEntityRegistry;
import com.st0x0ef.stellaris.common.registry.ItemsRegistry;
import com.st0x0ef.stellaris.common.registry.BlocksRegistry;
import com.tterrag.registrate.util.entry.ItemProviderEntry;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.minecraft.resources.ResourceLocation;


public class CSPonders {


    public static void register(PonderSceneRegistrationHelper<ResourceLocation> helper) {

        PonderSceneRegistrationHelper<ItemProviderEntry<?, ?>> HELPER = helper.withKeyFunction(RegistryEntry::getId);

        HELPER.forComponents(BlocksRegistry.COAL_GENERATOR)
                .addStoryBoard("coalgeneratorponder", CSScenes.CoalGenPonder::Test, AllCreatePonderTags.CONTRAPTION_ASSEMBLY);
    }
}
