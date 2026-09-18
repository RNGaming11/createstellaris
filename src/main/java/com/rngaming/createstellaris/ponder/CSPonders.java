package com.rngaming.createstellaris.ponder;

import com.rngaming.createstellaris.CreateStellaris;
import com.st0x0ef.stellaris.common.registry.BlocksRegistry;
import net.createmod.ponder.api.registration.PonderPlugin;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;


public class CSPonders implements PonderPlugin {

    public static void register(PonderSceneRegistrationHelper<ResourceLocation> helper) {
        helper.forComponents(BlocksRegistry.COAL_GENERATOR.getId())
                .addStoryBoard("coalgeneratorponder", CSScenes::CoalGenPonder);
        helper.forComponents(BlocksRegistry.DIESEL_GENERATOR.getId())
                .addStoryBoard("dieselgeneratorponder", CSScenes::DieselGenPonder);
        helper.forComponents(BlocksRegistry.RADIOACTIVE_GENERATOR.getId())
                .addStoryBoard("radioactivegeneratorponder", CSScenes::RadioactiveGenPonder);
        helper.forComponents(BlocksRegistry.WATER_PUMP.getId())
                .addStoryBoard("waterpumpponder", CSScenes::WaterPumpPonder);
        helper.forComponents(BlocksRegistry.SOLAR_PANEL.getId())
                .addStoryBoard("solarpanelponder", CSScenes::solarpanelponder);
        helper.forComponents(BlocksRegistry.OXYGEN_DISTRIBUTOR.getId())
                .addStoryBoard("oxygendisponder", CSScenes::OxygendisPonder);
        helper.forComponents(BlocksRegistry.T1_CABLE.getId())
                .addStoryBoard("cableponder", CSScenes::CablePonder);
        helper.forComponents(BlocksRegistry.T2_CABLE.getId())
                .addStoryBoard("cableponder", CSScenes::CablePonder);
        helper.forComponents(BlocksRegistry.T3_CABLE.getId())
                .addStoryBoard("cableponder", CSScenes::CablePonder);
        helper.forComponents(BlocksRegistry.PUMPJACK.getId())
                .addStoryBoard("pumpjackponder", CSScenes::PumpjackPonder);
        helper.forComponents(BlocksRegistry.T1_PIPE.getId())
                .addStoryBoard("pipeponder", CSScenes::Pipeponder);
        helper.forComponents(BlocksRegistry.T2_PIPE.getId())
                .addStoryBoard("pipeponder", CSScenes::Pipeponder);
        helper.forComponents(BlocksRegistry.T3_PIPE.getId())
                .addStoryBoard("pipeponder", CSScenes::Pipeponder);
        helper.forComponents(BlocksRegistry.T1_TANK.getId())
                .addStoryBoard("fluid_tank_ponder", CSScenes::Fluidtanks);
        helper.forComponents(BlocksRegistry.T2_TANK.getId())
                .addStoryBoard("fluid_tank_ponder", CSScenes::Fluidtanks);
        helper.forComponents(BlocksRegistry.T3_TANK.getId())
                .addStoryBoard("fluid_tank_ponder", CSScenes::Fluidtanks);
        helper.forComponents(BlocksRegistry.T4_TANK.getId())
                .addStoryBoard("fluid_tank_ponder", CSScenes::Fluidtanks);
        helper.forComponents(BlocksRegistry.T1_POWER_BANK.getId(), BlocksRegistry.T2_POWER_BANK.getId(), BlocksRegistry.T3_POWER_BANK.getId(), BlocksRegistry.T4_POWER_BANK.getId())
                .addStoryBoard("powerbankponder", CSScenes::powerbankponderstore)
                .addStoryBoard("powerbankponderuse", CSScenes::powerbankponderuse);
    }

    @Override
    public @NotNull String getModId() {
        return CreateStellaris.MODID;
    }
}
