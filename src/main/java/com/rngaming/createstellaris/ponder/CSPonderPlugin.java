package com.rngaming.createstellaris.ponder;

import com.rngaming.createstellaris.CreateStellaris;
import net.createmod.ponder.api.registration.PonderPlugin;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.createmod.ponder.api.registration.PonderTagRegistrationHelper;
import net.minecraft.resources.ResourceLocation;

public class CSPonderPlugin implements PonderPlugin {
    @Override
    public String getModId() {
        return CreateStellaris.MODID;
    }


    @Override
    public void registerScenes(PonderSceneRegistrationHelper<ResourceLocation> helper) {
        CSPonders.register(helper);
    }

    @Override
    public void registerTags(PonderTagRegistrationHelper<ResourceLocation> helper) {
        CSPonderTags.register(helper);
    }
}
